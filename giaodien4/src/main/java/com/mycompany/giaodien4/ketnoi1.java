package com.mycompany.giaodien4;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ketnoi1 {
    // Kết nối CSDL
    public static Connection getConn() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsanpham", "root", "");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    // Lấy danh sách sản phẩm
    public static ArrayList<sanpham> getlistLoaiSP() {
        ArrayList<sanpham> listLoaiSP = new ArrayList<>();
        Connection connection = getConn();
        if (connection != null) {
            String sql = "SELECT `MaSP`, `Sanpham`, `Dongia`, `Maloai` FROM `sanpham`";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    sanpham s = new sanpham(rs.getString("MaSP"), rs.getString("Sanpham"), rs.getInt("Dongia"), rs.getString("Maloai"));
                    listLoaiSP.add(s);
                }
                rs.close();
                st.close();
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return listLoaiSP;
    }
}
