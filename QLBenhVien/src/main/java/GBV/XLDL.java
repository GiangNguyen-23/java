/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GBV;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Hoang
 */
public class XLDL {
    public static Connection getCon() {
        Connection conn = null;

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/benhvien", "root", "Tuan@123");
        } catch (Exception e) {
            System.out.println("ERR Connect MySQL: " + e.getMessage());
        }
        return conn;
    }
     public ResultSet LoadData(String sql) {
        ResultSet result = null;
        Connection conn = getCon();
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("ERR LoadData: " + e.getMessage());
            return null;
        }
    }
     
    public static ResultSet getBS() {
        ResultSet result = null;
        Connection conn = getCon();
        String sql = "select * from tbbacsi";
        try {
            Statement statement = conn.createStatement();
            return statement.executeQuery(sql);
        } catch (SQLException e) {
            System.out.println("ERR LoadData: " + e.getMessage());
            return null;
        }
    }

    public static void insertBS (String ma,String hoten, String gt, String Khoa,float luong) {
        Connection conn = getCon();
        String sql = "INSERT INTO tbbacsi values('" + ma + "',N'" +hoten + "',N'" +gt + "',N'" +Khoa + "','"+luong+"')";
        try {
            Statement statement = conn.createStatement();
            statement.executeUpdate(sql);
        } catch (SQLException e) {
            System.out.println("ERR UpdateData: " + e.getMessage());
        }
    }
    
}
