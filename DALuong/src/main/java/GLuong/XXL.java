/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GLuong;

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
public class XXL {

    // Kết nối CSDL
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlluong", "root", "");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static ArrayList<Nhanvien> getNVbyMa() {
        ArrayList<Nhanvien> list = new ArrayList<>();
        Connection connection = getCon();
        if (connection != null) {
            String sql = "SELECT `MaNV`, `Hoten`, `Diachi`, `Luong` FROM `tbnhanvien1`";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Nhanvien s = new Nhanvien(rs.getString("Diachi"), rs.getString("Luong"), rs.getString("MaNV"), rs.getString("Hoten"));
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
    public static void updateNV(String manv, String hoten, String GT, String diachi, String luong) {
        Connection connection = getCon();
        if (connection != null) {
            try {
                String sql = "UPDATE tbnhanvien1 SET Hoten = ?, Diachi = ?, Luong = ? WHERE MaNV = ?";
                PreparedStatement pstmt = connection.prepareStatement(sql);
                pstmt.setString(2, hoten);
                pstmt.setString(3, GT);
                pstmt.setString(4, diachi);
                pstmt.setString(5, luong);
            } catch (Exception e) {
                
            }
        }
        }
    
    

}
