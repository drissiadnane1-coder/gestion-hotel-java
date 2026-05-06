package controller;

import view.AfficherChambreView;
import view.AjouterChambreView;
import view.ChambreMenuView;
import view.ModifierChambreView;
import view.SupprimerChambreView;

public class ChambreMenuController {

    private ChambreMenuView menuView;

    public ChambreMenuController(ChambreMenuView menuView) {
        this.menuView = menuView;

        menuView.ajouterButton.addActionListener(e -> {
            AjouterChambreView view = new AjouterChambreView();
            new AjouterChambreController(view);
            view.setVisible(true);
        });

        menuView.modifierButton.addActionListener(e -> {
            ModifierChambreView view = new ModifierChambreView();
            new ModifierChambreController(view);
            view.setVisible(true);
        });

        menuView.supprimerButton.addActionListener(e -> {
            SupprimerChambreView view = new SupprimerChambreView();
            new SupprimerChambreController(view);
            view.setVisible(true);
        });

        menuView.afficherButton.addActionListener(e -> {
            AfficherChambreView view = new AfficherChambreView();
            new AfficherChambreController(view);
            view.setVisible(true);
        });
    }
}
