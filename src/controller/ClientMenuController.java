package controller;

import view.ClientMenuView;
import view.AjouterClientView;
import view.ModifierClientView;
import view.SupprimerClientView;
import view.AfficherClientView;

public class ClientMenuController {

    private ClientMenuView menuView;

    public ClientMenuController(ClientMenuView menuView) {
        this.menuView = menuView;

        menuView.ajouterButton.addActionListener(e -> {
            AjouterClientView view = new AjouterClientView();
            new AjouterClientController(view);
            view.setVisible(true);
        });

        menuView.modifierButton.addActionListener(e -> {
            ModifierClientView view = new ModifierClientView();
            new ModifierClientController(view);
            view.setVisible(true);
        });

        menuView.supprimerButton.addActionListener(e -> {
            SupprimerClientView view = new SupprimerClientView();
            new SupprimerClientController(view);
            view.setVisible(true);
        });

        menuView.afficherButton.addActionListener(e -> {
            AfficherClientView view = new AfficherClientView();
            new AfficherClientController(view);
            view.setVisible(true);
        });
    }
}