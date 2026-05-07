package controller;

import dao.ClientDAO;
import view.SupprimerClientView;

import javax.swing.*;

public class SupprimerClientController {

    private SupprimerClientView view;
    private ClientDAO dao;

    public SupprimerClientController(SupprimerClientView view) {
        this.view = view;
        this.dao = new ClientDAO();

        view.supprimerButton.addActionListener(e -> supprimerClient());
    }

    private void supprimerClient() {
        try {
            int id = Integer.parseInt(view.idField.getText());

            int rowsAffecter = dao.supprimerClient(id);
            
            if(rowsAffecter == 0) {
                JOptionPane.showMessageDialog(view, "Aucun client trouvé avec cet ID !", "Erreur", JOptionPane.ERROR_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(view, "Client supprimé avec succès !");
                view.dispose();           	
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "ID invalide !");
        }
    }
}