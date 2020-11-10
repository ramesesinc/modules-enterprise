package com.rameses.enterprise.models;

import com.rameses.rcp.annotations.*;
import com.rameses.rcp.common.*
import com.rameses.osiris2.client.*
import com.rameses.osiris2.common.*
import com.rameses.rulemgmt.constraint.*;
import com.rameses.rulemgmt.*;
import com.rameses.seti2.models.*;


public class SysSigantureLookupModel extends CrudLookupModel {
    
    public String getConnection() {
        return caller.getConnection();
    }
    
    
}