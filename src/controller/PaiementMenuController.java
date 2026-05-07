package controller;

import view.*;

public class PaiementMenuController {

    private PaiementMenuView menuView;

    public PaiementMenuController(PaiementMenuView menuView) {

        this.menuView = menuView;

        menuView.ajouterButton.addActionListener(e -> {

            AjouterPaiementView view = new AjouterPaiementView();

            new AjouterPaiementController(view);

            view.setVisible(true);
        });

        menuView.modifierButton.addActionListener(e -> {

            ModifierPaiementView view = new ModifierPaiementView();

            new ModifierPaiementController(view);

            view.setVisible(true);
        });

        menuView.supprimerButton.addActionListener(e -> {

            SupprimerPaiementView view = new SupprimerPaiementView();

            new SupprimerPaiementController(view);

            view.setVisible(true);
        });

        menuView.afficherButton.addActionListener(e -> {

            AfficherPaiementView view = new AfficherPaiementView();

            new AfficherPaiementController(view);

            view.setVisible(true);
        });
    }
}