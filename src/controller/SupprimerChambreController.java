package controller;

import dao.ChambreDAO;
import view.SupprimerChambreView;

import javax.swing.*;

public class SupprimerChambreController {

    private SupprimerChambreView view;
    private ChambreDAO dao;

    public SupprimerChambreController(SupprimerChambreView view) {
        this.view = view;
        this.dao = new ChambreDAO();

        view.supprimerButton.addActionListener(e -> supprimerChambre());
    }

    private void supprimerChambre() {
        try {
            int id = Integer.parseInt(view.idField.getText());

            dao.supprimerChambre(id);
            JOptionPane.showMessageDialog(view, "Chambre supprimée avec succès !");
            view.dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "ID invalide !");
        }
    }
}
