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

            int rowsAffecter = dao.supprimerChambre(id);
            
            if(rowsAffecter == 0) {
                JOptionPane.showMessageDialog(view, "Aucun client trouvé avec cet ID !", "Erreur", JOptionPane.ERROR_MESSAGE);            	
            }
            else {
            	JOptionPane.showMessageDialog(view, "Chambre supprimée avec succès !");
            	view.dispose();
            }
            

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "ID invalide !");
        }
    }
}
