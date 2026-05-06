package controller;

import dao.ChambreDAO;
import model.Chambre;
import view.AfficherChambreView;

import java.util.List;

public class AfficherChambreController {

    private AfficherChambreView view;
    private ChambreDAO dao;

    public AfficherChambreController(AfficherChambreView view) {
        this.view = view;
        this.dao = new ChambreDAO();

        loadChambres();

        view.actualiserButton.addActionListener(e -> loadChambres());
    }

    private void loadChambres() {
        List<Chambre> chambres = dao.getAllChambres();

        view.tableModel.setRowCount(0);

        for (Chambre c : chambres) {
            view.tableModel.addRow(new Object[] {
                c.getId(),
                c.getNumero(),
                c.getType(),
                c.getEtage(),
                c.getPrixParNuit(),
                c.getStatut()
            });
        }
    }
}
