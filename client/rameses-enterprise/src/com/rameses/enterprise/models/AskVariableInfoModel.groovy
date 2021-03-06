package com.rameses.enterprise.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*
import com.rameses.osiris2.client.*
import com.rameses.osiris2.common.*
import com.rameses.rulemgmt.constraint.*;
import com.rameses.rulemgmt.*;

/***
* This class runs in conjunction with RuleExecutor. 
* This displays the info
* 
****/
public class AskVariableInfoModel {
    
    def ruleExecutor;
    def infoStack = new Stack();
    def infos;
    def defaultInfos;
    def params = [:];
    def resultHandler;
    def formInfos = [];
    
    //comprator is overridable. By default it compares two names
    def comparator = {item,bean-> bean.name == item.name};
    
    void init() {
        if(!ruleExecutor) throw new Exception("ruleExecutor is required in AskInfoModel");
        if(!resultHandler) throw new Exception("resultHandler is required in AskInfoModel");
        defaultInfos = params.defaultinfos;
        if(!infos)throw new Exception("infos is required in AskInfoModel");
        infoStack.clear();
        buildFormInfos();
    }

    public def getDefaultValue( def item ) {
        if( !defaultInfos) return item.value;
        def rv = defaultInfos.find{ comparator(it, item) };
        if( rv ) return rv.value;
        return item.defaultvalue;
    }
    
    boolean getHasBack() {
        return !infoStack.empty();
    }
    
    def createStackedInfos() {
        def pInfos = [];
        for( st in infoStack ) {
            pInfos.addAll( st );
        }
        pInfos.addAll(infos);
        return pInfos;
    }
    
    def doNext() {
        //build all infos and send for processing...
        def p = [:];
        p.putAll(params);
        p.infos = createStackedInfos();
        def result = ruleExecutor( p );
        if(result.askinfos) {
            if(infos) infoStack.push( infos );
            infos = result.askinfos;
            buildFormInfos();
            return null;
        }
        else {
            //This is the ending
            def infos = createStackedInfos();
            if( result.infos ) {
                infos.addAll( result.infos );
            }	            
            result.infos = infos;
            resultHandler( result );
            return "_close";
        }
    }
    
    def doBack() {
        if(infoStack.empty()) return "_close";
        infos = infoStack.pop();
        println infoStack.size();
        buildFormInfos();
        return null;
    }
    
    def doCancel() {
        infoStack.clear();
        if(infos) infos.clear();
        resultHandler("_close");
        return "_close";
    }
    
    def buildFormInfos() {
        formInfos.clear();
        infos = infos.sort{ it.sortorder }
        infos.each {x->
            x.value = getDefaultValue( x );
            def i = [
                type:x.datatype, 
                caption:x.caption, 
                categoryid: x.category,
                name:x.name, 
                bean: x,
                required: true,
                properties: [:],
                value: x.value
            ];
            //fix the datatype
            if(x.datatype.indexOf("_")>0) {
                x.datatype = x.datatype.substring(0, x.datatype.indexOf("_"));
            }
            if(i.type == "boolean") {
                i.type = "yesno";
            }
            else if(i.type == "string_array") {
                i.type = "combo";
                i.preferredSize = '150,20';
                i.itemsObject = x.arrayvalues;
            }
            else if( i.type == 'decimal' ) {
                i.preferredSize = '150,20';
            }
            else if( i.type == 'integer' ) {
                i.preferredSize = '150,20';
            }
            else if( i.type == "string" ) {
                i.type = "text";
            }
            formInfos << i;
        }
     }
     
     def formPanel = [
        updateBean: {name,value,item->
            item.bean.value = value;
        },
        getControlList: {
            return formInfos;
        }
    ] as FormPanelModel;
    
    
}