package controller;

import dao.ReservationDAO;
import model.Reservation;
import view.ModifierReservationView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.*;

public class ModifierReservationController {

    private ModifierReservationView view;
    private ReservationDAO dao;

    public ModifierReservationController(ModifierReservationView view) {

        this.view = view;
        this.dao = new ReservationDAO();

        view.modifierButton.addActionListener(e -> modifierReservation());
    }

    private void modifierReservation() {

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    	    

    	
        try {
       	 LocalDate dateDebut = LocalDate.parse(view.dateDebutField.getText().trim(), formatter);
       	 LocalDate dateFin = LocalDate.parse(view.dateFinField.getText().trim(), formatter);
        	
            Reservation reservation = new Reservation(
                    Integer.parseInt(view.clientIdField.getText()),
                    Integer.parseInt(view.chambreIdField.getText()),
                    dateDebut,
                    dateFin,
                    view.statutField.getText()
            );

            dao.ajouterReservation(reservation);

            JOptionPane.showMessageDialog(view, "Réservation ajoutée avec succès !");

            view.dispose();
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(view, "Veuillez entrer des identifiants valides (Chiffres uniquement).", "Erreur de saisie", JOptionPane.ERROR_MESSAGE);
        } catch (DateTimeParseException dtpe) {
            JOptionPane.showMessageDialog(view, "Format de date invalide ! Veuillez utiliser le format YYYY-MM-DD.", "Erreur de date", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {

            JOptionPane.showMessageDialog(view, "Erreur lors de l'ajout !");
        }
    } 
}