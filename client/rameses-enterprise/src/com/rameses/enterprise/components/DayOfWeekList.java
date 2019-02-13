/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.enterprise.components;

import com.rameses.rcp.control.XComponentPanel;
import com.rameses.rcp.ui.annotations.ComponentBean;

/**
 *
 * @author Elmo Nazareno
 */
@ComponentBean("com.rameses.enterprise.components.DayOfWeekListModel")
public class DayOfWeekList extends XComponentPanel{

    /**
     * Creates new form DayOfWeekList
     */
    public DayOfWeekList() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        component = new com.rameses.rcp.control.XComboBox();

        setLayout(new java.awt.BorderLayout());

        component.setCaption("Day of Week");
        component.setExpression("#{item.title}");
        component.setItemKey("key");
        component.setItems("dowList");
        component.setName("dow"); // NOI18N
        add(component, java.awt.BorderLayout.NORTH);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XComboBox component;
    // End of variables declaration//GEN-END:variables
}