package GSV;

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
public class XLDL {
    // getCon
    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/qlsv", "root", "12345678");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }
    //getDanhSachSV 
    public static ArrayList<SinhVien> getDanhSachSV () {
        ArrayList<SinhVien> listsv = new ArrayList<>();
        Connection connection = getCon();
        if (connection != null) {
            String sql = "SELECT * FROM qlsv.tbsinhvien ORDER BY Ten ASC;";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    SinhVien s = new SinhVien(rs.getString("KhoaId"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("GT"), rs.getInt("NamSinh"));
                    listsv.add(s);
                }
                rs.close();
                st.close();
                connection.close();
            } catch (SQLException e) {
            }
        }
        return listsv;
    }
    //getDanhSachKhoa
    public static ArrayList<String> getDanhSachKhoa() {
        ArrayList<String> listkhoa = new ArrayList<>();
        Connection connection = getCon();
        if (connection != null) {
            String sql = "SELECT Ma FROM qlsv.tbkhoa;";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    String khoa = rs.getString("Ma");
                    listkhoa.add(khoa);
                }
                rs.close();
                st.close();
                connection.close();
            } catch (SQLException e) {
            }
        }
        return listkhoa;
    }
   
    //insert
    public static void insertSV(String Ma, String Ten, String GT, int NamSinh, String Khoa) {
        Connection connection = getCon();
        if (connection != null) {
            try {
                String sql = "INSERT INTO `qlsv`.`tbsinhvien` (`Ma`, `Ten`, `GT`, `NamSinh`, `KhoaId`) VALUES ('"+Ma+"', '"+Ten+"', '"+GT+"', '"+NamSinh+"', '"+Khoa+"');";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                connection.close();
            } catch (SQLException e) {
            }
        }
    }
}
