package com.rameses.enterprise.views;

import com.rameses.rcp.common.ImageCropper;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author elmonazareno
 */
@Template(CrudFormPage.class)
public class SysSignaturePage extends javax.swing.JPanel {

    /**
     * Creates new form OboSignaturePage
     */
    public SysSignaturePage() {
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

        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xLookupField1 = new com.rameses.rcp.control.XLookupField();
        xTextField2 = new com.rameses.rcp.control.XTextField();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xPhoto2 = new com.rameses.rcp.control.XPhoto();
        xButton1 = new com.rameses.rcp.control.XButton();
        xButton2 = new com.rameses.rcp.control.XButton();
        xTextField3 = new com.rameses.rcp.control.XTextField();

        xFormPanel1.setCaptionWidth(120);

        xLookupField1.setCaption("Lookup Name");
        xLookupField1.setExpression("#{ entity.user.name }");
        xLookupField1.setHandler("sys_user:lookup");
        xLookupField1.setName("entity.user"); // NOI18N
        xLookupField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xFormPanel1.add(xLookupField1);

        xTextField2.setCaption("Display Name");
        xTextField2.setName("entity.displayname"); // NOI18N
        xTextField2.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField2.setRequired(true);
        xTextField2.setTextCase(com.rameses.rcp.constant.TextCase.NONE);
        xFormPanel1.add(xTextField2);

        xTextField1.setCaption("Position");
        xTextField1.setName("entity.position"); // NOI18N
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField1.setRequired(true);
        xTextField1.setTextCase(com.rameses.rcp.constant.TextCase.NONE);
        xFormPanel1.add(xTextField1);

        xPhoto2.setCaption("Signature");
        xPhoto2.setName("entity.signature"); // NOI18N
        xPhoto2.setBackground(new java.awt.Color(255, 255, 255));
        xPhoto2.setNoImageIcon("");
        xPhoto2.setOpaque(true);
        xPhoto2.setPreferredSize(new java.awt.Dimension(0, 150));
        xPhoto2.setText("xPhoto2");
        xFormPanel1.add(xPhoto2);

        xButton1.setCaption("");
        xButton1.setName("changePhoto"); // NOI18N
        xButton1.setVisibleWhen("#{ mode!='read' && entity.signature == null }");
        xButton1.setText("Change ");
        xFormPanel1.add(xButton1);

        xButton2.setCaption("");
        xButton2.setName("removePhoto"); // NOI18N
        xButton2.setVisibleWhen("#{ mode!='read' && entity.signature != null }");
        xButton2.setText("Remove");
        xFormPanel1.add(xButton2);

        xTextField3.setCaption("Tag");
        xTextField3.setName("entity.tag"); // NOI18N
        xTextField3.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField3.setSpaceChar('_');
        xFormPanel1.add(xTextField3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 443, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.rcp.control.XButton xButton1;
    private com.rameses.rcp.control.XButton xButton2;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XLookupField xLookupField1;
    private com.rameses.rcp.control.XPhoto xPhoto2;
    private com.rameses.rcp.control.XTextField xTextField1;
    private com.rameses.rcp.control.XTextField xTextField2;
    private com.rameses.rcp.control.XTextField xTextField3;
    // End of variables declaration//GEN-END:variables
}