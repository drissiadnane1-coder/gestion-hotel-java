package view;

import javax.swing.*;

public class ReservationMenuView extends JFrame {	

    public JButton ajouterButton;
    public JButton modifierButton;
    public JButton supprimerButton;
    public JButton afficherButton;

    public ReservationMenuView() {

        setTitle("Gestion Réservations");
        setSize(350, 300);
        setLocationRelativeTo(null);
        setLayout(null);

        ajouterButton = new JButton("Ajouter réservation");
        ajouterButton.setBounds(70, 40, 200, 30);
        add(ajouterButton);

        modifierButton = new JButton("Modifier réservation");
        modifierButton.setBounds(70, 90, 200, 30);
        add(modifierButton);

        supprimerButton = new JButton("Supprimer réservation");
        supprimerButton.setBounds(70, 140, 200, 30);
        add(supprimerButton);

        afficherButton = new JButton("Afficher réservations");
        afficherButton.setBounds(70, 190, 200, 30);
        add(afficherButton);
    }
}