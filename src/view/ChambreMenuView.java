package view;

import javax.swing.*;

public class ChambreMenuView extends JFrame {

    public JButton ajouterButton;
    public JButton modifierButton;
    public JButton supprimerButton;
    public JButton afficherButton;

    public ChambreMenuView() {
        setTitle("Gestion Chambres");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        ajouterButton = new JButton("Ajouter chambre");
        ajouterButton.setBounds(80, 40, 180, 30);
        add(ajouterButton);

        modifierButton = new JButton("Modifier chambre");
        modifierButton.setBounds(80, 90, 180, 30);
        add(modifierButton);

        supprimerButton = new JButton("Supprimer chambre");
        supprimerButton.setBounds(80, 140, 180, 30);
        add(supprimerButton);

        afficherButton = new JButton("Afficher chambres");
        afficherButton.setBounds(80, 190, 180, 30);
        add(afficherButton);
    }
}
