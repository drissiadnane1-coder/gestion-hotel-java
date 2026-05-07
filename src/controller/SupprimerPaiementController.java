package controller;

import dao.PaiementDAO;
import view.SupprimerPaiementView;

import javax.swing.*;

public class SupprimerPaiementController {

    private SupprimerPaiementView view;
    private PaiementDAO dao;

    public SupprimerPaiementController(SupprimerPaiementView view) {

        this.view = view;
        this.dao = new PaiementDAO();

        view.supprimerButton.addActionListener(e -> supprimerPaiement());
    }

    private void supprimerPaiement() {

        try {

            int id = Integer.parseInt(view.idField.getText());

            int rowsAffecter = dao.supprimerPaiement(id);
            
            if(rowsAffecter == 0 ) {
                JOptionPane.showMessageDialog(view, "Aucun paiement trouvé avec cet ID !", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(view, "Paiement supprime !");

                view.dispose();
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(view, "Erreur suppression !");
        }
    }
}