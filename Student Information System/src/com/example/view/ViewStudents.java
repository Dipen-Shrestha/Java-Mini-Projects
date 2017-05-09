/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.view;

import com.example.common.DBConnection;
import com.example.controller.StudentDAO;
import com.example.model.Students;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
/**
 *
 * @author Dipen
 */
public class ViewStudents extends javax.swing.JInternalFrame {

    DefaultTableModel model;
    public ViewStudents() {
        initComponents();
               
        model= new DefaultTableModel(null,new String[]{"Id","Name","Gender","Faculty","Address","Email","Remarks","Pic"});
        jTable1.setModel(model);
        
        buttonGroup1.add(jRadioButton_Male);    //self written code
        buttonGroup1.add(jRadioButton_Female);
    }
private void clearModel(){ //to clear the value which is already loaded
    int rowCount=model.getRowCount();
    for(int i=0;i<rowCount;i++)
            model.removeRow(0); 
    }

private void LoadData(){
     clearModel();
       StudentDAO stdDAO=new StudentDAO();
       ArrayList <Students> list = stdDAO.viewStudents();
       for(int i =0;i<list.size();i++)
           model.addRow(new Object[]{list.get(i).getId(),
           list.get(i).getName(), list.get(i).getGender(),
           list.get(i).getFaculty(),list.get(i).getAddress(),
           list.get(i).getEmail(),list.get(i).getRemarks(), 
           list.get(i).getPic()});
}

public void clearAll(){
        jTextField_Id.setText("");
        jTextField_Name.setText("");
        jTextField_Address.setText("");
        jTextField_Email.setText("");
        jTextArea_Remarks.setText("");
        buttonGroup1.clearSelection();
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton_LoadData = new javax.swing.JButton();
        jLabel_Name = new javax.swing.JLabel();
        jLabel_Gender = new javax.swing.JLabel();
        jLabel_Faculty = new javax.swing.JLabel();
        jLabel_Address = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jComboBox_Faculty = new javax.swing.JComboBox<>();
        jTextField_Address = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea_Remarks = new javax.swing.JTextArea();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Id = new javax.swing.JTextField();
        jLabel_Picture = new javax.swing.JLabel();

        setClosable(true);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton_LoadData.setText("Load Data");
        jButton_LoadData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_LoadDataActionPerformed(evt);
            }
        });

        jLabel_Name.setText("Name");

        jLabel_Gender.setText("Gender");

        jLabel_Faculty.setText("Faculty");

        jLabel_Address.setText("Address");

        jLabel1.setText("Email");

        jLabel2.setText("Remarks");

        jTextField_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_NameActionPerformed(evt);
            }
        });

        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        jRadioButton_Female.setText("Female");
        jRadioButton_Female.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_FemaleActionPerformed(evt);
            }
        });

        jComboBox_Faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc. CSIT", "BIM", "BSW" }));

        jTextField_Address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AddressActionPerformed(evt);
            }
        });

        jTextArea_Remarks.setColumns(20);
        jTextArea_Remarks.setRows(5);
        jScrollPane2.setViewportView(jTextArea_Remarks);

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jLabel3.setText("Id");

        jTextField_Id.setEditable(false);

        jLabel_Picture.setText("Picture");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jButton_LoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(38, 38, 38)
                            .addComponent(jTextField_Email))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(8, 8, 8)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Id, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jRadioButton_Female, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox_Faculty, 0, 186, Short.MAX_VALUE)
                                    .addComponent(jTextField_Address))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jLabel_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jTextField_Id, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_Gender, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton_Male, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton_Female, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jComboBox_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel_Faculty, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_Address, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton_LoadData, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(129, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_LoadDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_LoadDataActionPerformed
       LoadData();
    }//GEN-LAST:event_jButton_LoadDataActionPerformed

    private void jTextField_AddressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AddressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AddressActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row=jTable1.getSelectedRow();
        jTextField_Id.setText(jTable1.getValueAt(row,0).toString());
        jTextField_Name.setText(jTable1.getValueAt(row,1).toString());
        String gender=jTable1.getValueAt(row,2).toString();
        if(gender.equalsIgnoreCase("Male"))
               jRadioButton_Male.setSelected(true);
        else
            jRadioButton_Female.setSelected(true);
        jComboBox_Faculty.setSelectedItem(jTable1.getValueAt(row,3).toString());
        jTextField_Address.setText(jTable1.getValueAt(row,4).toString());
        jTextField_Email.setText(jTable1.getValueAt(row,5).toString());
        jTextArea_Remarks.setText(jTable1.getValueAt(row,6).toString());
        String imgname=jTable1.getValueAt(row,7).toString();
        File myfile=new File("f:/image/"+imgname);
        ImageIcon img=new ImageIcon(myfile.toString());
        Image newimg=img.getImage().getScaledInstance(200,200,BufferedImage.SCALE_DEFAULT);
        jLabel_Picture.setIcon(new ImageIcon(newimg));
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jTextField_Id.getText());
        Students ob=new Students();
        ob.setId(id);
        
        StudentDAO stdDAO=new StudentDAO();
        stdDAO.deleteStudent(ob);
        LoadData();
        
        clearAll();
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        int id=Integer.parseInt(jTextField_Id.getText());
        String name = jTextField_Name.getText();
       String gender= "";
       if(jRadioButton_Male.isSelected())
           gender= "Male";
       else
           gender = "Female";
       String faculty = jComboBox_Faculty.getSelectedItem().toString();
       String address = jTextField_Address.getText();
       String email = jTextField_Email.getText();
       String remarks = jTextArea_Remarks.getText();
     
       Students ob=new Students();
       ob.setName(name);
       ob.setGender(gender);
       ob.setFaculty(faculty);
       ob.setAddress(address);
       ob.setEmail(email);
       ob.setRemarks(remarks);
       ob.setId(id);
       
       StudentDAO stdDAO=new StudentDAO();
       stdDAO.updateStudent(ob);
       
       LoadData();
       clearAll();
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jTextField_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_NameActionPerformed

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jRadioButton_FemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_FemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_FemaleActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_LoadData;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JComboBox<String> jComboBox_Faculty;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_Address;
    private javax.swing.JLabel jLabel_Faculty;
    private javax.swing.JLabel jLabel_Gender;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Picture;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea_Remarks;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Id;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}
