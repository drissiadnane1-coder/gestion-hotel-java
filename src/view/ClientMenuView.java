package view;

import javax.swing.*;

public class ClientMenuView extends JFrame {

    public JButton ajouterButton;
    public JButton modifierButton;
    public JButton supprimerButton;
    public JButton afficherButton;

    public ClientMenuView() {

        setTitle("Gestion Clients");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        ajouterButton = new JButton("Ajouter client");
        ajouterButton.setBounds(80, 40, 180, 30);
        add(ajouterButton);

        modifierButton = new JButton("Modifier client");
        modifierButton.setBounds(80, 90, 180, 30);
        add(modifierButton);

        supprimerButton = new JButton("Supprimer client");
        supprimerButton.setBounds(80, 140, 180, 30);
        add(supprimerButton);

        afficherButton = new JButton("Afficher clients");
        afficherButton.setBounds(80, 190, 180, 30);
        add(afficherButton);
    }
}