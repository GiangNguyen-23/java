/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GKH;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author Giang Nguyễn
 */
public class XLKH {

    // Kết nối CSDL
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlkh", "root", "");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<Khachhang> getKH() {
        ArrayList<Khachhang> list = new ArrayList<>();
        Connection connection = getCon();
        if (connection != null) {
            String sql = "SELECT `SoTK`, `Hoten`, `GT`, `Diachi`, `Sodu` FROM `tbkhachhang`";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Khachhang s = new Khachhang(rs.getString("Diachi"), rs.getString("Sodu"), rs.getString("SoTK"), rs.getString("Hoten"),rs.getString("GT"));
                    list.add(s);
                }
                rs.close();
                st.close();
                connection.close();
            } catch (SQLException e) {
            }
        }
        return list;
    }
    // Nhập mới một khách hàng vào bảng tbKhachhang
    public static void insertSP(String SoTK, String Hoten, String GT, String Diachi, String Sodu) {
        Connection connection = getCon();
        if (connection != null) {
            try {
                String sql = "INSERT INTO `tbkhachhang`(`SoTK`, `Hoten`, `GT`, `Diachi`, `Sodu`) VALUES (?, ?, ?, ?, ?)";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(1, SoTK);
                pstmt.setString(2, Hoten);
                pstmt.setString(3, GT);
                pstmt.setString(4, Diachi);
                pstmt.setString(5, Sodu);

                pstmt.executeUpdate();

                pstmt.close();
                connection.close();
            } catch (SQLException e) {
            }
        }
    }

    
    
    
}
