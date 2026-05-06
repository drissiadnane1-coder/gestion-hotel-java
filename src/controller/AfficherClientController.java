package controller;

import dao.ClientDAO;
import model.Client;
import view.AfficherClientView;

import java.util.List;

public class AfficherClientController {

    private AfficherClientView view;
    private ClientDAO dao;

    public AfficherClientController(AfficherClientView view) {
        this.view = view;
        this.dao = new ClientDAO();

        loadClients();

        view.actualiserButton.addActionListener(e -> loadClients());
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
}