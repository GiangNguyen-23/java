/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GGV;

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
public class XLGV {
    // Kết nối CSDL
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/dlgv", "root", "12345678");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    public static ArrayList<Giangvien> getGV() {
        ArrayList<Giangvien> list = new ArrayList<>();
        Connection connection = getCon();
        if (connection != null) {
            String sql = "SELECT * FROM tbgiangvien";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    //Giangvien s = new Giangvien();
                    Giangvien s = new Giangvien(rs.getString("Donvi"), rs.getInt("Soct"), rs.getString("MaDD"), rs.getString("Hoten"), rs.getString("GT"));
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
    
    
}
