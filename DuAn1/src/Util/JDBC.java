/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author HuyAll
 */
public class JDBC {
    private static Connection conn;

    public static Connection getConnection() {
        if (conn == null) {
            try {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                String dbUrl = "jdbc:sqlserver://localhost:1433;databaseName=DuAn1",
                        dbUser = "huyall", dbPass = "duchuy2002";
                conn = DriverManager.getConnection(dbUrl, dbUser, dbPass);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    public static PreparedStatement prepa(String query) throws SQLException {
        return getConnection().prepareStatement(query);
    }

    public static PreparedStatement prepare(String query) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
