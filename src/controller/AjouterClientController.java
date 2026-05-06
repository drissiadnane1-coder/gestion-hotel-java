package controller;

import dao.ClientDAO;
import model.Client;
import view.AjouterClientView;

import javax.swing.*;

public class AjouterClientController {

    private AjouterClientView view;
    private ClientDAO dao;

    public AjouterClientController(AjouterClientView view) {
        this.view = view;
        this.dao = new ClientDAO();

        view.ajouterButton.addActionListener(e -> ajouterClient());
    }

    private void ajouterClient() {
        Client client = new Client(
            view.nomField.getText(),
            view.prenomField.getText(),
            view.telephoneField.getText(),
            view.emailField.getText(),
            view.adresseField.getText(),
            view.pieceIdentiteField.getText()
        );

        dao.ajouterClient(client);
        JOptionPane.showMessageDialog(view, "Client ajouté avec succès !");
        view.dispose();
    }
}
