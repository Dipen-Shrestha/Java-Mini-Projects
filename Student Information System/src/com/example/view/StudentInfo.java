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
import java.sql.*;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;

/**
 *
 * @author Dipen
 */
public class StudentInfo extends javax.swing.JInternalFrame {
    File myfile;    //self written code. 

    /**
     * Creates new form StudentInfo
     */
    public StudentInfo() {
        initComponents();
        buttonGroup1.add(jRadioButton_Male);    //self written code
        buttonGroup1.add(jRadioButton_Female);  //self written code
    }
    
    public void clearAll(){
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
        jLabel_Name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Address = new javax.swing.JTextField();
        jRadioButton_Male = new javax.swing.JRadioButton();
        jRadioButton_Female = new javax.swing.JRadioButton();
        jComboBox_Faculty = new javax.swing.JComboBox<>();
        jTextField_Name = new javax.swing.JTextField();
        jTextField_Email = new javax.swing.JTextField();
        jButton_Save = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea_Remarks = new javax.swing.JTextArea();
        jLabel_Picture = new javax.swing.JLabel();
        jButton_Browse = new javax.swing.JButton();

        setClosable(true);
        setTitle("Student Info");

        jLabel_Name.setText("Name");

        jLabel2.setText("Gender");

        jLabel3.setText("Faculty");

        jLabel4.setText("Address");

        jLabel5.setText("Remarks");

        jLabel6.setText("Email");

        jRadioButton_Male.setText("Male");
        jRadioButton_Male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton_MaleActionPerformed(evt);
            }
        });

        jRadioButton_Female.setText("Female");

        jComboBox_Faculty.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BSc. CSIT", "BIM", "BSW" }));
        jComboBox_Faculty.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox_FacultyActionPerformed(evt);
            }
        });

        jTextField_Email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_EmailActionPerformed(evt);
            }
        });

        jButton_Save.setText("Save");
        jButton_Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_SaveActionPerformed(evt);
            }
        });

        jTextArea_Remarks.setColumns(20);
        jTextArea_Remarks.setRows(5);
        jScrollPane1.setViewportView(jTextArea_Remarks);

        jLabel_Picture.setText("Picture");

        jButton_Browse.setText("Browse");
        jButton_Browse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BrowseActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jRadioButton_Male)
                                .addGap(18, 18, 18)
                                .addComponent(jRadioButton_Female))
                            .addComponent(jTextField_Email)
                            .addComponent(jTextField_Address)
                            .addComponent(jComboBox_Faculty, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jTextField_Name)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jButton_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton_Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jTextField_Name)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jRadioButton_Male)
                                    .addComponent(jRadioButton_Female))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jComboBox_Faculty, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Email, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(85, 85, 85)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jTextField_Address, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton_Save, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton_Browse, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(144, 144, 144))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox_FacultyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox_FacultyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox_FacultyActionPerformed

    private void jButton_SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_SaveActionPerformed

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
       
       //to generate a new unique name for image
       Random rd=new Random();
       int nn=rd.nextInt();
       String picname=String.valueOf(nn);  //can be done as: String picname=nn+""
       //to get extension from selected image
       int pos=myfile.toString().lastIndexOf(".");
       String ext=myfile.toString().substring(pos);
       
       
       Students ob=new Students();
       ob.setName(name);
       ob.setGender(gender);
       ob.setFaculty(faculty);
       ob.setAddress(address);
       ob.setEmail(email);
       ob.setRemarks(remarks);
       ob.setPic(picname+ext);
       
       StudentDAO stdDAO = new StudentDAO();
       stdDAO.insertStudent(ob);
       stdDAO.uploadImage(myfile,picname+ext);
       clearAll();
       jLabel_Picture.setIcon(null);
    }//GEN-LAST:event_jButton_SaveActionPerformed

    private void jRadioButton_MaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton_MaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton_MaleActionPerformed

    private void jTextField_EmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_EmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_EmailActionPerformed

    private void jButton_BrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BrowseActionPerformed
        // TODO add your handling code here:
        JFileChooser fc=new JFileChooser();
        fc.showOpenDialog(null);
        myfile=fc.getSelectedFile();
        ImageIcon img=new ImageIcon(myfile.toString());
        Image newimg=img.getImage().getScaledInstance(200,200,BufferedImage.SCALE_DEFAULT);
        jLabel_Picture.setIcon(new ImageIcon(newimg));
    }//GEN-LAST:event_jButton_BrowseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton_Browse;
    private javax.swing.JButton jButton_Save;
    private javax.swing.JComboBox<String> jComboBox_Faculty;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel_Name;
    private javax.swing.JLabel jLabel_Picture;
    private javax.swing.JRadioButton jRadioButton_Female;
    private javax.swing.JRadioButton jRadioButton_Male;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea_Remarks;
    private javax.swing.JTextField jTextField_Address;
    private javax.swing.JTextField jTextField_Email;
    private javax.swing.JTextField jTextField_Name;
    // End of variables declaration//GEN-END:variables
}