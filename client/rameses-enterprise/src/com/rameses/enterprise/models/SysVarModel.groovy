package com.rameses.enterprise.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*
import com.rameses.osiris2.client.*
import com.rameses.osiris2.common.*;
import com.rameses.seti2.common.*;
import com.rameses.seti2.models.*;


/*******************************************************************
* This is used for building dynamic controls in variable
* This returns a list of controls to be used by the xform panel
********************************************************************/
public class SysVarModel extends CrudFormModel {
    
    @Caller
    def caller;
    
    public String getConnection() {
        return caller.getConnection();
    }
    
}