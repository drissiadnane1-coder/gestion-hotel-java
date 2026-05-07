package controller;

import dao.ReservationDAO;
import view.SupprimerReservationView;

import javax.swing.*;

public class SupprimerReservationController {

    private SupprimerReservationView view;
    private ReservationDAO dao;

    public SupprimerReservationController(SupprimerReservationView view) {

        this.view = view;
        this.dao = new ReservationDAO();

        view.supprimerButton.addActionListener(e -> supprimerReservation());
    }

    private void supprimerReservation() {

        try {

            int id = Integer.parseInt(view.idField.getText());

            dao.supprimerReservation(id);

            JOptionPane.showMessageDialog(view, "Réservation supprimée !");

            view.dispose();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(view, "Erreur suppression !");
        }
    }
}