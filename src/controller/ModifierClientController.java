package controller;

import dao.ClientDAO;
import model.Client;
import view.ModifierClientView;

import javax.swing.*;

public class ModifierClientController {

    private ModifierClientView view;
    private ClientDAO dao;

    public ModifierClientController(ModifierClientView view) {
        this.view = view;
        this.dao = new ClientDAO();

        view.modifierButton.addActionListener(e -> modifierClient());
    }

    private void modifierClient() {
        try {
            Client client = new Client(
                Integer.parseInt(view.idField.getText()),
                view.nomField.getText(),
                view.prenomField.getText(),
                view.telephoneField.getText(),
                view.emailField.getText(),
                view.adresseField.getText(),
                view.pieceIdentiteField.getText()
            );

            dao.modifierClient(client);
            JOptionPane.showMessageDialog(view, "Client modifié avec succès !");
            view.dispose();

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(view, "ID invalide !");
        }
    }
}
