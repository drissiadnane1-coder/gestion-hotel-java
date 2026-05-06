package dao;

import database.DatabaseConnection;
import model.Hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class HotelDAO {

    public Hotel getHotel() {
        String sql = "SELECT * FROM hotel LIMIT 1";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return new Hotel(
                    rs.getInt("id"),
                    rs.getString("nom"),
                    rs.getString("adresse"),
                    rs.getString("telephone")
                );
            }

        } catch (SQLException e) {
            System.out.println("Erreur lors de l'affichage de l'hotel !");
            e.printStackTrace();
        }

        return null;
    }

    public void modifierHotel(Hotel hotel) {
        String sql = "UPDATE hotel SET nom=?, adresse=?, telephone=? WHERE id=?";

        try {
            Connection con = DatabaseConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, hotel.getNom());
            ps.setString(2, hotel.getAdresse());
            ps.setString(3, hotel.getTelephone());
            ps.setInt(4, hotel.getId());

            ps.executeUpdate();
            System.out.println("Hotel modifié avec succès !");

        } catch (SQLException e) {
            System.out.println("Erreur lors de la modification de l'hotel !");
            e.printStackTrace();
        }
    }
}