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

            dao.supprimerClient(id);
            JOptionPane.showMessageDialog(view, "Client supprimé avec succès !");
            view.dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "ID invalide !");
        }
    }
}