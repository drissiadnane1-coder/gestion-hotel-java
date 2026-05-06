package controller;

import dao.ClientDAO;
import model.Client;
import view.ClientView;

import javax.swing.*;
import java.util.List;

public class ClientController {

    private ClientView view;
    private ClientDAO dao;

    public ClientController(ClientView view) {
        this.view = view;
        this.dao = new ClientDAO();

        loadClients();

        view.ajouterButton.addActionListener(e -> ajouterClient());
        view.modifierButton.addActionListener(e -> modifierClient());
        view.supprimerButton.addActionListener(e -> supprimerClient());
        view.actualiserButton.addActionListener(e -> loadClients());

        view.clientTable.getSelectionModel().addListSelectionListener(e -> remplirChamps());
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

        JOptionPane.showMessageDialog(view, "Client ajouté !");
        loadClients();
    }

    private void modifierClient() {

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

        JOptionPane.showMessageDialog(view, "Client modifié !");
        loadClients();
    }

    private void supprimerClient() {

        int id = Integer.parseInt(view.idField.getText());

        dao.supprimerClient(id);

        JOptionPane.showMessageDialog(view, "Client supprimé !");
        loadClients();
    }

    private void loadClients() {

        List<Client> clients = dao.getAllClients();

        view.tableModel.setRowCount(0);

        for (Client c : clients) {

            view.tableModel.addRow(new Object[] {
                    c.getId(),
                    c.getNom(),
                    c.getPrenom(),
                    c.getTelephone(),
                    c.getEmail(),
                    c.getAdresse(),
                    c.getPieceIdentite()
            });
        }
    }

    private void remplirChamps() {

        int row = view.clientTable.getSelectedRow();

        if(row != -1) {

            view.idField.setText(view.tableModel.getValueAt(row, 0).toString());
            view.nomField.setText(view.tableModel.getValueAt(row, 1).toString());
            view.prenomField.setText(view.tableModel.getValueAt(row, 2).toString());
            view.telephoneField.setText(view.tableModel.getValueAt(row, 3).toString());
            view.emailField.setText(view.tableModel.getValueAt(row, 4).toString());
            view.adresseField.setText(view.tableModel.getValueAt(row, 5).toString());
            view.pieceIdentiteField.setText(view.tableModel.getValueAt(row, 6).toString());
        }
    }
}