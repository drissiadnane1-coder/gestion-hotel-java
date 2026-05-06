package dao;

import database.DatabaseConnection;
import model.Paiement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;

public class PaiementDAO {

    public void ajouterPaiement(Paiement paiement) {
        String sql = "INSERT INTO paiements(reservation_id, date_paiement, montant, mode_paiement) VALUES (?, ?, ?, ?)";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, paiement.getReservationId());
            ps.setDate(2, paiement.getDatePaiement());
            ps.setDouble(3, paiement.getMontant());
            ps.setString(4, paiement.getModePaiement());

            ps.executeUpdate();
            System.out.println("Paiement ajouté avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout du paiement !");
            e.printStackTrace();
        }
    }

    public List<Paiement> getAllPaiements() {
        List<Paiement> paiements = new ArrayList<>();
        String sql = "SELECT * FROM paiements";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Paiement p = new Paiement(
                    rs.getInt("id"),
                    rs.getInt("reservation_id"),
                    rs.getDate("date_paiement"),
                    rs.getDouble("montant"),
                    rs.getString("mode_paiement")
                );

                paiements.add(p);
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'affichage des paiements !");
            e.printStackTrace();
        }

        return paiements;
    }

    public void supprimerPaiement(int id) {
        String sql = "DELETE FROM paiements WHERE id=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Paiement supprimé avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression du paiement !");
            e.printStackTrace();
        }
    }
}
