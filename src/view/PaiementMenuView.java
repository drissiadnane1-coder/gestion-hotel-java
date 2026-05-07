package view;

import javax.swing.*;

public class PaiementMenuView extends JFrame {

    public JButton ajouterButton;
    public JButton modifierButton;
    public JButton supprimerButton;
    public JButton afficherButton;

    public PaiementMenuView() {

        setTitle("Gestion Paiements");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        ajouterButton = new JButton("Ajouter paiement");
        ajouterButton.setBounds(70, 40, 200, 30);
        add(ajouterButton);

        modifierButton = new JButton("Modifier paiement");
        modifierButton.setBounds(70, 90, 200, 30);
        add(modifierButton);

        supprimerButton = new JButton("Supprimer paiement");
        supprimerButton.setBounds(70, 140, 200, 30);
        add(supprimerButton);

        afficherButton = new JButton("Afficher paiements");
        afficherButton.setBounds(70, 190, 200, 30);
        add(afficherButton);
    }
}