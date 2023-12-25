/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.giaodien4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Giang Nguyễn
 */
public class ketnoi {

    //ket noi
    public static Connection getConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsanpham", "root", "");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
        }
        return null;
    }

    public static ArrayList<SP> getlistSP() {
        ArrayList<SP> listSP = new ArrayList<>();
        Connection connection = getConn();
        String sql = "SELECT * FROM loaisp";
        Statement st;
        ResultSet rs;
        try {
            st = connection.createStatement();
            rs = st.executeQuery(sql);
            SP s;
            while (rs.next()) {
                s = new SP(rs.getString("Maloai"), rs.getString("Tenloai"));
                listSP.add(s);
            }
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listSP;

    }
}
