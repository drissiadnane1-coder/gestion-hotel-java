package controller;

import dao.ChambreDAO;
import model.Chambre;
import view.ModifierChambreView;

import javax.swing.*;

public class ModifierChambreController {

    private ModifierChambreView view;
    private ChambreDAO dao;

    public ModifierChambreController(ModifierChambreView view) {
        this.view = view;
        this.dao = new ChambreDAO();

        view.modifierButton.addActionListener(e -> modifierChambre());
    }

    private void modifierChambre() {
        try {
            Chambre chambre = new Chambre(
                Integer.parseInt(view.idField.getText()),
                view.numeroField.getText(),
                view.typeField.getText(),
                Integer.parseInt(view.etageField.getText()),
                Double.parseDouble(view.prixField.getText()),
                view.statutField.getText()
            );

            int rowsAffecter = dao.modifierChambre(chambre);
            
            if(rowsAffecter == 0) {
                JOptionPane.showMessageDialog(view, "Aucun client trouvé avec cet ID !", "Erreur", JOptionPane.ERROR_MESSAGE);           	
            }
            else {
                JOptionPane.showMessageDialog(view, "Chambre modifiée avec succès !");
                view.dispose();     	
            }


        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "ID, étage ou prix invalide !");
        }
    }
}
