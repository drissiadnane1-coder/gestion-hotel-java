package controller;

import dao.ChambreDAO;
import model.Chambre;
import view.AjouterChambreView;

import javax.swing.*;

public class AjouterChambreController {

    private AjouterChambreView view;
    private ChambreDAO dao;

    public AjouterChambreController(AjouterChambreView view) {
        this.view = view;
        this.dao = new ChambreDAO();

        view.ajouterButton.addActionListener(e -> ajouterChambre());
    }

    private void ajouterChambre() {
        try {
            Chambre chambre = new Chambre(
                view.numeroField.getText(),
                view.typeField.getText(),
                Integer.parseInt(view.etageField.getText()),
                Double.parseDouble(view.prixField.getText()),
                view.statutField.getText()
            );

            dao.ajouterChambre(chambre);
            JOptionPane.showMessageDialog(view, "Chambre ajoutée avec succès !");
            view.dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "Étage ou prix invalide !");
        }
    }
}