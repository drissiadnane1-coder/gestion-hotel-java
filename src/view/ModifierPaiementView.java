package view;

import javax.swing.*;

public class ModifierPaiementView extends JFrame {

    public JTextField idField;
    public JTextField reservationIdField;
    public JTextField datePaiementField;
    public JTextField montantField;
    public JTextField modePaiementField;

    public JButton modifierButton;

    public ModifierPaiementView() {

        setTitle("Modifier Paiement");
        setSize(400, 380);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID Paiement:");
        idLabel.setBounds(30, 20, 130, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(180, 20, 150, 25);
        add(idField);

        JLabel reservationLabel = new JLabel("ID Réservation:");
        reservationLabel.setBounds(30, 60, 130, 25);
        add(reservationLabel);

        reservationIdField = new JTextField();
        reservationIdField.setBounds(180, 60, 150, 25);
        add(reservationIdField);

        JLabel dateLabel = new JLabel("Date Paiement:");
        dateLabel.setBounds(30, 100, 130, 25);
        add(dateLabel);

        datePaiementField = new JTextField();
        datePaiementField.setBounds(180, 100, 150, 25);
        add(datePaiementField);

        JLabel montantLabel = new JLabel("Montant:");
        montantLabel.setBounds(30, 140, 130, 25);
        add(montantLabel);

        montantField = new JTextField();
        montantField.setBounds(180, 140, 150, 25);
        add(montantField);

        JLabel modeLabel = new JLabel("Mode Paiement:");
        modeLabel.setBounds(30, 180, 130, 25);
        add(modeLabel);

        modePaiementField = new JTextField();
        modePaiementField.setBounds(180, 180, 150, 25);
        add(modePaiementField);

        modifierButton = new JButton("Modifier");
        modifierButton.setBounds(120, 250, 120, 30);
        add(modifierButton);
    }
}