package com.fonseca.airport_db.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String url = "jdbc:mysql://localhost:3306/airport";
    private static final String user = "root";
    private static final String password = "Akkoaii4a*";

    private static Connection connection;

    public static Connection getConnection() {
        try {
            if (connection == null) {
                connection = DriverManager.getConnection(url, user, password);
            }
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}