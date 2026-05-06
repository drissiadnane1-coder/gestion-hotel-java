package dao;

import database.DatabaseConnection;
import model.Chambre;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class ChambreDAO {

    public void ajouterChambre(Chambre chambre) {
        String sql = "INSERT INTO chambres(numero, type, etage, prixParNuit, statut) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, chambre.getNumero());
            ps.setString(2, chambre.getType());
            ps.setInt(3, chambre.getEtage());
            ps.setDouble(4, chambre.getPrixParNuit());
            ps.setString(5, chambre.getStatut());

            ps.executeUpdate();
            System.out.println("Chambre ajoutée avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de la chambre !");
            e.printStackTrace();
        }
    }

    public List<Chambre> getAllChambres() {
        List<Chambre> chambres = new ArrayList<>();
        String sql = "SELECT * FROM chambres";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Chambre chambre = new Chambre(
                    rs.getInt("id"),
                    rs.getString("numero"),
                    rs.getString("type"),
                    rs.getInt("etage"),
                    rs.getDouble("prixParNuit"),
                    rs.getString("statut")
                );

                chambres.add(chambre);
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'affichage des chambres !");
            e.printStackTrace();
        }

        return chambres;
    }

    public void modifierChambre(Chambre chambre) {
        String sql = "UPDATE chambres SET numero=?, type=?, etage=?, prixParNuit=?, statut=? WHERE id=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, chambre.getNumero());
            ps.setString(2, chambre.getType());
            ps.setInt(3, chambre.getEtage());
            ps.setDouble(4, chambre.getPrixParNuit());
            ps.setString(5, chambre.getStatut());
            ps.setInt(6, chambre.getId());

            ps.executeUpdate();
            System.out.println("Chambre modifiée avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de la modification de la chambre !");
            e.printStackTrace();
        }
    }

    public void supprimerChambre(int id) {
        String sql = "DELETE FROM chambres WHERE id=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);

            ps.executeUpdate();
            System.out.println("Chambre supprimée avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression de la chambre !");
            e.printStackTrace();
        }
    }
}
