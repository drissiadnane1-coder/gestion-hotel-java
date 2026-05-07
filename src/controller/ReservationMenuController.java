package controller;

import view.*;

public class ReservationMenuController {

    private ReservationMenuView menuView;

    public ReservationMenuController(ReservationMenuView menuView) {

        this.menuView = menuView;

        menuView.ajouterButton.addActionListener(e -> {

            AjouterReservationView view = new AjouterReservationView();

            new AjouterReservationController(view);

            view.setVisible(true);
        });

        menuView.modifierButton.addActionListener(e -> {

            ModifierReservationView view = new ModifierReservationView();

            new ModifierReservationController(view);

            view.setVisible(true);
        });

        menuView.supprimerButton.addActionListener(e -> {

            SupprimerReservationView view = new SupprimerReservationView();

            new SupprimerReservationController(view);

            view.setVisible(true);
        });

        menuView.afficherButton.addActionListener(e -> {

            AfficherReservationView view = new AfficherReservationView();

            new AfficherReservationController(view);

            view.setVisible(true);
        });
    }
}