package dao;

import database.DatabaseConnection;
import model.Reservation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ReservationDAO {

    public void ajouterReservation(Reservation reservation) {
        String sql = "INSERT INTO reservations(client_id, chambre_id, date_debut, date_fin, statut) VALUES (?, ?, ?, ?, ?)";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, reservation.getClientId());
            ps.setInt(2, reservation.getChambreId());
            
            // CONVERSION : LocalDate -> java.sql.Date
            ps.setDate(3, java.sql.Date.valueOf(reservation.getDateDebut()));
            ps.setDate(4, java.sql.Date.valueOf(reservation.getDateFin()));
            
            ps.setString(5, reservation.getStatut());

            ps.executeUpdate();
            System.out.println("Réservation ajoutée avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'ajout de la réservation !");
            e.printStackTrace();
        }
    }

    public List<Reservation> getAllReservations() {
        List<Reservation> reservations = new ArrayList<>();
        String sql = "SELECT * FROM reservations";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                // CONVERSION : java.sql.Date -> LocalDate (.toLocalDate())
                Reservation r = new Reservation(
                    rs.getInt("id"),
                    rs.getInt("client_id"),
                    rs.getInt("chambre_id"),
                    rs.getDate("date_debut").toLocalDate(), // Modifié ici
                    rs.getDate("date_fin").toLocalDate(),   // Modifié ici
                    rs.getString("statut")
                );

                reservations.add(r);
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'affichage des réservations !");
            e.printStackTrace();
        }

        return reservations;
    }

    public void supprimerReservation(int id) {
        String sql = "DELETE FROM reservations WHERE id=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Réservation supprimée avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de la suppression de la réservation !");
            e.printStackTrace();
        }
    }
}