package dao;

import database.DatabaseConnection;
import model.Paiement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate; // Import manquant ajouté
import java.util.ArrayList;
import java.util.List;

public class PaiementDAO {

    public int ajouterPaiement(Paiement paiement) {
        String sql = "INSERT INTO paiements(reservation_id, date_paiement, montant, mode_paiement) VALUES (?, ?, ?, ?)";

        // Utilisation du try-with-resources pour fermer la connexion automatiquement
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, paiement.getReservationId());
            // Conversion LocalDate -> java.sql.Date pour la base de données
            ps.setDate(2, java.sql.Date.valueOf(paiement.getDatePaiement()));
            ps.setDouble(3, paiement.getMontant());
            ps.setString(4, paiement.getModePaiement());

            System.out.println("Paiement ajouté avec succès !");
            return ps.executeUpdate();
            
        } catch (SQLException e) {
            System.err.println("Erreur lors de l'ajout du paiement !");
            e.printStackTrace();
            return e.getErrorCode();
        }
    }

    public List<Paiement> getAllPaiements() {
        List<Paiement> paiements = new ArrayList<>();
        String sql = "SELECT * FROM paiements";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                // Conversion SQL Date -> LocalDate
                LocalDate date = rs.getDate("date_paiement").toLocalDate();
                
                Paiement p = new Paiement(
                    rs.getInt("id"),
                    rs.getInt("reservation_id"),
                    date, // On utilise bien l'objet LocalDate ici
                    rs.getDouble("montant"),
                    rs.getString("mode_paiement")
                );

                paiements.add(p);
            }

        } catch (SQLException e) {
            System.err.println("Erreur lors de l'affichage des paiements !");
            e.printStackTrace();
        }

        return paiements;
    }

    public int supprimerPaiement(int id) {
        String sql = "DELETE FROM paiements WHERE id=?";

        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, id);

            System.out.println("Paiement supprimé avec succès !");
            return ps.executeUpdate();

        } catch (SQLException e) {
            System.err.println("Erreur lors de la suppression du paiement !");
            e.printStackTrace();
            return e.getErrorCode();
        }
    }
    
    public boolean reservationExiste(int reservationId) {
        String sql = "SELECT COUNT(*) FROM reservations WHERE id = ?";
        try (Connection con = DatabaseConnection.getConnection();
             PreparedStatement ps = con.prepareStatement(sql)) {
            
            ps.setInt(1, reservationId);
            try (ResultSet rs = ps.executeQuery()) {
                if (rs.next()) {
                    return rs.getInt(1) > 0;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }
}