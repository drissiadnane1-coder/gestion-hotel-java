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
        setSize(400, 320);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel reservationLabel = new JLabel("ID Réservation:");
        reservationLabel.setBounds(30, 30, 130, 25);
        add(reservationLabel);

        reservationIdField = new JTextField();
        reservationIdField.setBounds(30, 30, 130, 25);
        add(reservationIdField);
        
        
        JLabel dateLabel = new JLabel("Date: ");
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
        
        
        JLabel modePaiementLabel = new JLabel("Montant de paiement:");
        modePaiementLabel.setBounds(330, 180, 130, 25);
        add(modePaiementLabel);

        modePaiementField = new JTextField();
        modePaiementField.setBounds(180, 180, 150, 25);
        add(modePaiementField);
        
        ajouterButton = new JButton("Ajouter");
        ajouterButton.setBounds(120, 250, 120, 30);
        add(ajouterButton);
    }
}
        