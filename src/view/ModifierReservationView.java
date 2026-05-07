package view;

import javax.swing.*;

public class ModifierReservationView extends JFrame {

    public JTextField idField;
    public JTextField clientIdField;
    public JTextField chambreIdField;
    public JTextField dateDebutField;
    public JTextField dateFinField;
    public JTextField statutField;

    public JButton modifierButton;

    public ModifierReservationView() {

        setTitle("Modifier Réservation");
        setSize(400, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID Réservation:");
        idLabel.setBounds(30, 20, 120, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(170, 20, 150, 25);
        add(idField);

        JLabel clientLabel = new JLabel("ID Client:");
        clientLabel.setBounds(30, 60, 120, 25);
        add(clientLabel);

        clientIdField = new JTextField();
        clientIdField.setBounds(170, 60, 150, 25);
        add(clientIdField);

        JLabel chambreLabel = new JLabel("ID Chambre:");
        chambreLabel.setBounds(30, 100, 120, 25);
        add(chambreLabel);

        chambreIdField = new JTextField();
        chambreIdField.setBounds(170, 100, 150, 25);
        add(chambreIdField);

        JLabel debutLabel = new JLabel("Date début:");
        debutLabel.setBounds(30, 140, 120, 25);
        add(debutLabel);

        dateDebutField = new JTextField();
        dateDebutField.setBounds(170, 140, 150, 25);
        add(dateDebutField);

        JLabel finLabel = new JLabel("Date fin:");
        finLabel.setBounds(30, 180, 120, 25);
        add(finLabel);

        dateFinField = new JTextField();
        dateFinField.setBounds(170, 180, 150, 25);
        add(dateFinField);

        JLabel statutLabel = new JLabel("Statut:");
        statutLabel.setBounds(30, 220, 120, 25);
        add(statutLabel);

        statutField = new JTextField();
        statutField.setBounds(170, 220, 150, 25);
        add(statutField);

        modifierButton = new JButton("Modifier");
        modifierButton.setBounds(120, 290, 120, 30);
        add(modifierButton);
    }
}