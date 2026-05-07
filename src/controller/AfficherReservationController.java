package controller;

import dao.ReservationDAO;
import model.Reservation;
import view.AfficherReservationView;

import java.util.List;

public class AfficherReservationController {

    private AfficherReservationView view;
    private ReservationDAO dao;

    public AfficherReservationController(AfficherReservationView view) {

        this.view = view;
        this.dao = new ReservationDAO();

        loadReservations();

        view.actualiserButton.addActionListener(e -> loadReservations());
    }

    private void loadReservations() {

        List<Reservation> reservations = dao.getAllReservations();

        view.tableModel.setRowCount(0);

        for (Reservation r : reservations) {

            view.tableModel.addRow(new Object[] {
                    r.getId(),
                    r.getClientId(),
                    r.getChambreId(),
                    r.getDateDebut(),
                    r.getDateFin(),
                    r.getStatut()
            });
        }
    }
}