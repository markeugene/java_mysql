package com.company;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class ConnectorDB {
    public static Connection getConnection() throws SQLException
    {
        String url = "jdbc:mysql://localhost:3306/sergo";
        String user = "root";
        String pass = "plsnever123A";
        Connection cn=DriverManager.getConnection(url,user,pass);
        return cn;
    }
}
