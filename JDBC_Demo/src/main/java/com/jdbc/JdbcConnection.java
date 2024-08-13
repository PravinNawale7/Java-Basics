package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcConnection {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/jdbc", "root", "root");
            System.out.println("Connection Successful");
        } catch (Exception e) {
            System.out.println("Error: " + e.toString());
        }
    }
}
