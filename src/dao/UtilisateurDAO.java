package dao;

import database.DatabaseConnection;
import model.Utilisateur;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UtilisateurDAO {

    public boolean login(String username, String password) {

        String sql = "SELECT * FROM utilisateurs WHERE username=? AND password=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, username);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch (SQLException e) {
            System.out.println("Erreur de connexion utilisateur !");
            e.printStackTrace();
        }

        return false;
    }
}
