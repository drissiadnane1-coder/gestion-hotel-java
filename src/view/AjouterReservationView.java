package view;

import javax.swing.*;

public class AjouterReservationView extends JFrame {

    public JTextField clientIdField;
    public JTextField chambreIdField;
    public JTextField dateDebutField;
    public JTextField dateFinField;
    public JTextField statutField;

    public JButton ajouterButton;

    public AjouterReservationView() {

        setTitle("Ajouter Réservation");
        setSize(400, 350);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel clientLabel = new JLabel("ID Client:");
        clientLabel.setBounds(30, 30, 120, 25);
        add(clientLabel);

        clientIdField = new JTextField();
        clientIdField.setBounds(170, 30, 150, 25);
        add(clientIdField);

        JLabel chambreLabel = new JLabel("ID Chambre:");
        chambreLabel.setBounds(30, 70, 120, 25);
        add(chambreLabel);

        chambreIdField = new JTextField();
        chambreIdField.setBounds(170, 70, 150, 25);
        add(chambreIdField);

        JLabel debutLabel = new JLabel("Date début:");
        debutLabel.setBounds(30, 110, 120, 25);
        add(debutLabel);

        dateDebutField = new JTextField();
        dateDebutField.setBounds(170, 110, 150, 25);
        add(dateDebutField);

        JLabel finLabel = new JLabel("Date fin:");
        finLabel.setBounds(30, 150, 120, 25);
        add(finLabel);

        dateFinField = new JTextField();
        dateFinField.setBounds(170, 150, 150, 25);
        add(dateFinField);

        JLabel statutLabel = new JLabel("Statut:");
        statutLabel.setBounds(30, 190, 120, 25);
        add(statutLabel);

        statutField = new JTextField();
        statutField.setBounds(170, 190, 150, 25);
        add(statutField);

        ajouterButton = new JButton("Ajouter");
        ajouterButton.setBounds(120, 250, 120, 30);
        add(ajouterButton);
    }
}