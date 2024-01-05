package GPS;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class XLDL {
    // getCon

    public static Connection getCon() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/petshop", "root", "12345678");
            return conn;
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    //getDog
    public static ArrayList<Dog> getDog() {
        ArrayList<Dog> list = new ArrayList<>();
        Connection connection = getCon();
        if (connection != null) {
            String sql = "SELECT * FROM petshop.tbdog;";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Dog s = new Dog(rs.getString("QuocGia"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("GT"), rs.getInt("NamSinh"));
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

    //search
    public static ArrayList<Dog> searchDog(String Ten,String Ma) {
        ArrayList<Dog> list = new ArrayList<>();
        Connection connection = getCon();
        if (connection != null) {
        String sql = "SELECT * FROM tbdog WHERE Ten LIKE N'"+Ten+"' OR Ma LIKE N'"+Ma+"'";
            try {
                Statement st = connection.createStatement();
                ResultSet rs = st.executeQuery(sql);
                while (rs.next()) {
                    Dog s = new Dog(rs.getString("QuocGia"), rs.getString("Ma"), rs.getString("Ten"), rs.getString("GT"), rs.getInt("NamSinh"));
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
    //insert
    public static void insertDog(String Ma, String Ten, String GT, String QuocGia, int NamSinh) {
        Connection connection = getCon();
        if (connection != null) {
            try {
                String sql = "INSERT INTO `petshop`.`tbdog` (`Ma`, `Ten`, `GT`, `QuocGia`, `NamSinh`) VALUES ('" + Ma + "', '" + Ten + "', '" + GT + "', '" + QuocGia + "', '" + NamSinh + "');";
                Statement statement = connection.createStatement();
                statement.executeUpdate(sql);
                connection.close();
            } catch (SQLException e) {
            }
        }
    }
}
