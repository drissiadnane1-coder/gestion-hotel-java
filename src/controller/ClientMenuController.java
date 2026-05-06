package controller;

import view.ClientMenuView;
import view.ClientView;

public class ClientMenuController {

    private ClientMenuView menuView;

    public ClientMenuController(ClientMenuView menuView) {
        this.menuView = menuView;

        menuView.ajouterButton.addActionListener(e -> ouvrirClientView());
        menuView.modifierButton.addActionListener(e -> ouvrirClientView());
        menuView.supprimerButton.addActionListener(e -> ouvrirClientView());
        menuView.afficherButton.addActionListener(e -> ouvrirClientView());
    }

    private void ouvrirClientView() {
        ClientView clientView = new ClientView();
        new ClientController(clientView);
        clientView.setVisible(true);
    }
}