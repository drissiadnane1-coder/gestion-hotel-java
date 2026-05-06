package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    private static final String URL = "jdbc:mysql://localhost:3306/gestion_hotel";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Connexion réussie à MySQL !");
            return connection;
        } catch (SQLException e) {
            System.out.println("Erreur de connexion à MySQL !");
            e.printStackTrace();
            return null;
        }
    }
}