package controller;

import dao.PaiementDAO;
import model.Paiement;
import view.AfficherPaiementView;

import java.util.List;

public class AfficherPaiementController {

    private AfficherPaiementView view;
    private PaiementDAO dao;

    public AfficherPaiementController(AfficherPaiementView view) {

        this.view = view;
        this.dao = new PaiementDAO();

        loadPaiements();

        view.actualiserButton.addActionListener(e -> loadPaiements());
    }

    private void loadPaiements() {

        List<Paiement> paiements = dao.getAllPaiements();

        view.tableModel.setRowCount(0);

        for (Paiement p : paiements) {

            view.tableModel.addRow(new Object[] {
                    p.getId(),
                    p.getReservationId(),
                    p.getDatePaiement(),
                    p.getMontant(),
                    p.getModePaiement()
            });
        }
    }
}