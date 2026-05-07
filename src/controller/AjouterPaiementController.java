package controller;

import dao.PaiementDAO;
import model.Paiement;
import view.AjouterPaiementView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.*;


public class AjouterPaiementController {

    private AjouterPaiementView view;
    private PaiementDAO dao;

    public AjouterPaiementController(AjouterPaiementView view) {

        this.view = view;
        this.dao = new PaiementDAO();

        view.ajouterButton.addActionListener(e -> ajouterPaiement());
    }

    private void ajouterPaiement() {

        try {
        	LocalDate dateConvertie = LocalDate.parse(view.datePaiementField.getText());

        	int resId = Integer.parseInt(view.reservationIdField.getText());

            // VERIFICATION DE L'ID
            if (!dao.reservationExiste(resId)) {
                JOptionPane.showMessageDialog(view, 
                    "L'ID Réservation " + resId + " n'existe pas dans la base de données !", 
                    "Erreur de référence", 
                    JOptionPane.WARNING_MESSAGE);
                return; // On arrête l'exécution ici
            }
            
            Paiement paiement = new Paiement(
                    resId,
                    dateConvertie,
                    Double.parseDouble(view.montantField.getText()),
                    view.modePaiementField.getText()
            );

            dao.ajouterPaiement(paiement);

            JOptionPane.showMessageDialog(view, "Paiement ajouté avec succès !");

            view.dispose();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Veuillez saisir un ID valide (nombre).");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(view, "Erreur ajout paiement !");
        }
    }
}