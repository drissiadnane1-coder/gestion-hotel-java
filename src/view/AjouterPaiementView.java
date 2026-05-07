package view;

import javax.swing.*;

public class AjouterPaiementView extends JFrame {

    public JTextField reservationIdField;
    public JTextField datePaiementField;
    public JTextField montantField;
    public JTextField modePaiementField;
    public JButton ajouterButton;

    public AjouterPaiementView() {
        setTitle("Ajouter Paiement");
        setSize(400, 350); // Légèrement agrandi pour le confort
        setLocationRelativeTo(null);
        setLayout(null);

        // --- ID Réservation ---
        JLabel reservationLabel = new JLabel("ID Réservation:");
        reservationLabel.setBounds(30, 30, 130, 25);
        add(reservationLabel);

        reservationIdField = new JTextField();
        // CORRECTION : X était à 30 (superposé au label), on le déplace à 180
        reservationIdField.setBounds(180, 30, 150, 25); 
        add(reservationIdField);
        
        // --- Date ---
        JLabel dateLabel = new JLabel("Date (AAAA-MM-JJ):"); // Précision du format pour LocalDate
        dateLabel.setBounds(30, 70, 140, 25); // Ajusté Y pour l'espacement
        add(dateLabel);

        datePaiementField = new JTextField();
        datePaiementField.setBounds(180, 70, 150, 25);
        add(datePaiementField);
        
        // --- Montant ---
        JLabel montantLabel = new JLabel("Montant:");
        montantLabel.setBounds(30, 110, 130, 25);
        add(montantLabel);

        montantField = new JTextField();
        montantField.setBounds(180, 110, 150, 25);
        add(montantField);
        
        // --- Mode de Paiement ---
        JLabel modePaiementLabel = new JLabel("Mode de paiement:");
        // CORRECTION : X était à 330 (hors cadre), on le remet à 30
        modePaiementLabel.setBounds(30, 150, 150, 25);
        add(modePaiementLabel);

        modePaiementField = new JTextField();
        modePaiementField.setBounds(180, 150, 150, 25);
        add(modePaiementField);
        
        // --- Bouton ---
        ajouterButton = new JButton("Ajouter");
        // Ajusté pour être centré et plus bas
        ajouterButton.setBounds(130, 220, 120, 35);
        add(ajouterButton);
    }
}