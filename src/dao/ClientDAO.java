package dao;

import database.DatabaseConnection;
import model.Client;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class ClientDAO {

    public void ajouterClient(Client client) {
        String sql = "INSERT INTO clients(nom, prenom, telephone, email, adresse, pieceIdentite) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTelephone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAdresse());
            ps.setString(6, client.getPieceIdentite());

            ps.executeUpdate();
            System.out.println("Client ajouté avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du client !");
            e.printStackTrace();
        }
    }

    public List<Client> getAllClients() {
        List<Client> clients = new ArrayList<>();
        String sql = "SELECT * FROM clients";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Client c = new Client(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("prenom"),
                    rs.getString("telephone"),
                    rs.getString("email"),
                    rs.getString("adresse"),
                    rs.getString("pieceIdentite")
                );

                clients.add(c);
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'affichage des clients !");
            e.printStackTrace();
        }

        return clients;
    }

    public int modifierClient(Client client){
        String sql = "UPDATE clients SET nom=?, prenom=?, telephone=?, email=?, adresse=?, pieceIdentite=? WHERE id=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, client.getNom());
            ps.setString(2, client.getPrenom());
            ps.setString(3, client.getTelephone());
            ps.setString(4, client.getEmail());
            ps.setString(5, client.getAdresse());
            ps.setString(6, client.getPieceIdentite());
            ps.setInt(7, client.getId());

            
            System.out.println("Client modifié avec succès !");
            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erreur lors de la modification du client !");
            e.printStackTrace();
            return e.getErrorCode();
        }
    }

    public int supprimerClient(int id) {
        String sql = "DELETE FROM clients WHERE id=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            
            System.out.println("Client supprimé avec succès !");
            return ps.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du client !");
            e.printStackTrace();
            return e.getErrorCode();
        }
    }
}

