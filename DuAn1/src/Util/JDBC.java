package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JDBC {

    public static Connection getConnection(String database) {
        try {
            String username = "sa";
            String pass = "123";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String url = "jdbc:sqlserver://localhost:1433;databaseName=" + database;
            Connection cn = DriverManager.getConnection(url, username, pass);
            return cn;
        } catch (Exception e) {
            throw new RuntimeException();
        }
    }

    public static PreparedStatement prepa(String query) throws SQLException {
        return getConnection(query).prepareStatement(query);
    }

    public static PreparedStatement prepare(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
