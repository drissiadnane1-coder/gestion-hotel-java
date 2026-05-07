package controller;

import dao.PaiementDAO;
import model.Paiement;
import view.ModifierPaiementView;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

import javax.swing.*;


public class ModifierPaiementController {

    private ModifierPaiementView view;
    private PaiementDAO dao;

    public ModifierPaiementController(ModifierPaiementView view) {
        this.view = view;
        this.dao = new PaiementDAO();

        view.modifierButton.addActionListener(e -> modifierPaiement());
    }

    private void modifierPaiement() {
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
                    Integer.parseInt(view.idField.getText()),
                    Integer.parseInt(view.reservationIdField.getText()),
                    dateConvertie,
                    Double.parseDouble(view.montantField.getText()),
                    view.modePaiementField.getText()
            );
            int rowsAffecter = dao.ajouterPaiement(paiement); 
            
            if (rowsAffecter == 0) {
                JOptionPane.showMessageDialog(view, "Aucun paiement trouvé avec cet ID !", "Erreur", JOptionPane.ERROR_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(view, "Paiement modifié avec succès !");
                view.dispose();
            }

        } catch (DateTimeParseException e) {
            JOptionPane.showMessageDialog(view, "Format de date invalide (utilisez AAAA-MM-JJ) !", "Erreur Format", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Veuillez saisir des nombres valides pour l'ID et le Montant.", "Erreur Saisie", JOptionPane.ERROR_MESSAGE);
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(view, "Une erreur inattendue est survenue lors de la modification.");
        }
    }
}