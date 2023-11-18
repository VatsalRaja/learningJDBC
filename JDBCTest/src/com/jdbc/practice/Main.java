package com.jdbc.practice;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;

import javax.swing.JFileChooser;

public class Main {
    public static void main(String[] args) {
        try {
            
            Connection c = ConnectionProvider.getConnection();

            String q = "insert into images(pic) values(?)"; 

            java.sql.PreparedStatement pstmt = c.prepareStatement(q);

            JFileChooser jfc = new JFileChooser();

            jfc.showOpenDialog(null);

           File  file =  jfc.getSelectedFile();

           FileInputStream fis = new FileInputStream(file);

           pstmt.setBinaryStream(1, fis, fis.available());

           pstmt.executeUpdate();

           System.out.println("done.....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
