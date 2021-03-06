/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.rameses.enterprise.views;

import com.rameses.rcp.ui.annotations.StyleSheet;
import com.rameses.rcp.ui.annotations.Template;
import com.rameses.seti2.views.CrudFormPage;

/**
 *
 * @author Elmo Nazareno
 */
@Template(CrudFormPage.class)
@StyleSheet
public class HolidayPage extends javax.swing.JPanel {

    /**
     * Creates new form HolidayPage
     */
    public HolidayPage() {
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

        xFormPanel4 = new com.rameses.rcp.control.XFormPanel();
        xTextField1 = new com.rameses.rcp.control.XTextField();
        xFormPanel1 = new com.rameses.rcp.control.XFormPanel();
        xRadio1 = new com.rameses.rcp.control.XRadio();
        xRadio2 = new com.rameses.rcp.control.XRadio();
        xIntegerField1 = new com.rameses.rcp.control.XIntegerField();
        xFormPanel2 = new com.rameses.rcp.control.XFormPanel();
        monthList1 = new com.rameses.enterprise.components.MonthList();
        xFormPanel3 = new com.rameses.rcp.control.XFormPanel();
        xRadio3 = new com.rameses.rcp.control.XRadio();
        xIntegerField2 = new com.rameses.rcp.control.XIntegerField();
        xRadio4 = new com.rameses.rcp.control.XRadio();
        xIntegerField3 = new com.rameses.rcp.control.XIntegerField();
        dayOfWeekList1 = new com.rameses.enterprise.components.DayOfWeekList();

        xFormPanel4.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);

        xTextField1.setCaption("Holiday Name");
        xTextField1.setName("entity.name"); // NOI18N
        xTextField1.setCaptionWidth(90);
        xTextField1.setPreferredSize(new java.awt.Dimension(0, 20));
        xTextField1.setRequired(true);
        xFormPanel4.add(xTextField1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder1 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder1.setTitle("Year");
        xFormPanel1.setBorder(xTitledBorder1);
        xFormPanel1.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);

        xRadio1.setName("yearOption"); // NOI18N
        xRadio1.setOptionValue(0);
        xRadio1.setCellPadding(new java.awt.Insets(0, 40, 0, 0));
        xRadio1.setOpaque(false);
        xRadio1.setShowCaption(false);
        xRadio1.setText("Any Year");
        xFormPanel1.add(xRadio1);

        xRadio2.setName("yearOption"); // NOI18N
        xRadio2.setOptionValue(1);
        xRadio2.setCellPadding(new java.awt.Insets(0, 40, 0, 0));
        xRadio2.setOpaque(false);
        xRadio2.setShowCaption(false);
        xRadio2.setText("Specific Year");
        xFormPanel1.add(xRadio2);

        xIntegerField1.setCaption("Year");
        xIntegerField1.setDepends(new String[] {"yearOption"});
        xIntegerField1.setName("entity.year"); // NOI18N
        xIntegerField1.setVisibleWhen("#{ yearOption == 1 }");
        xIntegerField1.setCaptionWidth(60);
        xIntegerField1.setCellPadding(new java.awt.Insets(0, 60, 0, 0));
        xIntegerField1.setPreferredSize(new java.awt.Dimension(60, 20));
        xIntegerField1.setRequired(true);
        xFormPanel1.add(xIntegerField1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder2 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder2.setPadding(new java.awt.Insets(25, 6, 0, 0));
        xTitledBorder2.setTitle("Month");
        xFormPanel2.setBorder(xTitledBorder2);
        xFormPanel2.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);

        monthList1.setCaption("Month");
        monthList1.setCellPadding(new java.awt.Insets(0, 40, 0, 0));
        monthList1.setName("entity.month"); // NOI18N
        monthList1.setRequired(true);
        xFormPanel2.add(monthList1);

        com.rameses.rcp.control.border.XTitledBorder xTitledBorder3 = new com.rameses.rcp.control.border.XTitledBorder();
        xTitledBorder3.setTitle("Day");
        xFormPanel3.setBorder(xTitledBorder3);
        xFormPanel3.setCaptionVAlignment(com.rameses.rcp.constant.UIConstants.CENTER);

        xRadio3.setName("dayOption"); // NOI18N
        xRadio3.setOptionValue(0);
        xRadio3.setCellPadding(new java.awt.Insets(0, 40, 0, 0));
        xRadio3.setOpaque(false);
        xRadio3.setShowCaption(false);
        xRadio3.setText("Specific Day");
        xFormPanel3.add(xRadio3);

        xIntegerField2.setCaption("Day");
        xIntegerField2.setCaptionWidth(60);
        xIntegerField2.setCellPadding(new java.awt.Insets(0, 60, 0, 0));
        xIntegerField2.setDepends(new String[] {"dayOption"});
        xIntegerField2.setName("entity.day"); // NOI18N
        xIntegerField2.setPreferredSize(new java.awt.Dimension(50, 20));
        xIntegerField2.setRequired(true);
        xIntegerField2.setVisibleWhen("#{ dayOption == 0 }");
        xFormPanel3.add(xIntegerField2);

        xRadio4.setName("dayOption"); // NOI18N
        xRadio4.setOptionValue(1);
        xRadio4.setCellPadding(new java.awt.Insets(0, 40, 0, 0));
        xRadio4.setOpaque(false);
        xRadio4.setShowCaption(false);
        xRadio4.setText("Day of Week");
        xFormPanel3.add(xRadio4);

        xIntegerField3.setCaption("Week");
        xIntegerField3.setCaptionWidth(60);
        xIntegerField3.setCellPadding(new java.awt.Insets(0, 60, 0, 0));
        xIntegerField3.setDepends(new String[] {"dayOption"});
        xIntegerField3.setName("entity.week"); // NOI18N
        xIntegerField3.setPreferredSize(new java.awt.Dimension(50, 20));
        xIntegerField3.setRequired(true);
        xIntegerField3.setVisibleWhen("#{ dayOption == 1 }");
        xFormPanel3.add(xIntegerField3);

        dayOfWeekList1.setCaption("Day");
        dayOfWeekList1.setCaptionWidth(60);
        dayOfWeekList1.setCellPadding(new java.awt.Insets(0, 60, 0, 0));
        dayOfWeekList1.setDepends(new String[] {"dayOption"});
        dayOfWeekList1.setName("entity.dow"); // NOI18N
        dayOfWeekList1.setRequired(true);
        dayOfWeekList1.setVisibleWhen("#{ dayOption == 1 }");
        xFormPanel3.add(dayOfWeekList1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(xFormPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 359, Short.MAX_VALUE)
                    .addComponent(xFormPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xFormPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(xFormPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(xFormPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(xFormPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.rameses.enterprise.components.DayOfWeekList dayOfWeekList1;
    private com.rameses.enterprise.components.MonthList monthList1;
    private com.rameses.rcp.control.XFormPanel xFormPanel1;
    private com.rameses.rcp.control.XFormPanel xFormPanel2;
    private com.rameses.rcp.control.XFormPanel xFormPanel3;
    private com.rameses.rcp.control.XFormPanel xFormPanel4;
    private com.rameses.rcp.control.XIntegerField xIntegerField1;
    private com.rameses.rcp.control.XIntegerField xIntegerField2;
    private com.rameses.rcp.control.XIntegerField xIntegerField3;
    private com.rameses.rcp.control.XRadio xRadio1;
    private com.rameses.rcp.control.XRadio xRadio2;
    private com.rameses.rcp.control.XRadio xRadio3;
    private com.rameses.rcp.control.XRadio xRadio4;
    private com.rameses.rcp.control.XTextField xTextField1;
    // End of variables declaration//GEN-END:variables
}
