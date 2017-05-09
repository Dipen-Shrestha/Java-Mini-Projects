/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.controller;

import com.example.common.DBConnection;
import com.example.model.Students;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;



public class StudentDAO {
    public void insertStudent(Students ob){
        try{
            Connection con=DBConnection.getConnection();
           String sql = "insert into students(name,gender,faculty,address,email,remarks,pic) values (?,?,?,?,?,?,?)";
           PreparedStatement pst= con.prepareStatement(sql);
           pst.setString(1,ob.getName());
           pst.setString(2,ob.getGender());
           pst.setString(3,ob.getFaculty());
           pst.setString(4,ob.getAddress());
           pst.setString(5,ob.getEmail());
           pst.setString(6,ob.getRemarks());
           pst.setString(7,ob.getPic());
           pst.executeUpdate();
           javax.swing.JOptionPane.showMessageDialog(null,"Record Inserted");
          // clearAll();
           con.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    public void deleteStudent(Students ob){
        try{
            Connection con=DBConnection.getConnection();
            String sql= "delete from students where id=?";
            PreparedStatement pst = con.prepareStatement(sql);
            
            pst.setInt(1,ob.getId());
            pst.executeUpdate();
           
            con.close();
            javax.swing.JOptionPane.showMessageDialog(null,"Record Deleted");
            //LoadData();
            //clearAll();
            
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    public void updateStudent(Students ob){
        try{
            
           Connection con=DBConnection.getConnection();
           String sql = "update students set name=?,gender=?,faculty=?,address=?,email=?,remarks=? where id=?" ;
           PreparedStatement pst= con.prepareStatement(sql);
           pst.setString(1,ob.getName());
           pst.setString(2,ob.getGender());
           pst.setString(3,ob.getFaculty());
           pst.setString(4,ob.getAddress());
           pst.setString(5,ob.getEmail());
           pst.setString(6,ob.getRemarks());
           pst.setInt(7,ob.getId());
           pst.executeUpdate();
           javax.swing.JOptionPane.showMessageDialog(null,"Record Updated");
           //LoadData();
          // clearAll();
           con.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
    }
    
    
    public ArrayList <Students> viewStudents(){
        ArrayList<Students> list=new ArrayList();
        try{
            Connection con=DBConnection.getConnection();
            String sql="select * from students";
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery(sql);
            while(rs.next()){
                Students ob=new Students();
                ob.setId(rs.getInt("id"));
                ob.setName(rs.getString("name"));
                ob.setGender(rs.getString("gender"));
                ob.setFaculty(rs.getString("faculty"));
                ob.setAddress(rs.getString("address"));
                ob.setEmail(rs.getString("email"));
                ob.setRemarks(rs.getString("remarks"));
                ob.setPic(rs.getString("pic"));
                list.add(ob);
            }
            con.close();
        }catch (Exception ex){
            System.out.println(ex);
        }
        return list;
    }
   
    public void uploadImage(File myfile,String image){
        try{
            FileOutputStream fos=new FileOutputStream("f:/image/"+image);
                FileInputStream fin= new FileInputStream(myfile);
                int ch;
                while((ch=fin.read())!=-1){
                    fos.write((byte)ch);
                }
                fin.close();
                fos.close();
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
    
}
