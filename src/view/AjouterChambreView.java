package view;

import javax.swing.*;

public class AjouterChambreView extends JFrame {

    public JTextField numeroField, typeField, etageField, prixField, statutField;
    public JButton ajouterButton;

    public AjouterChambreView() {
        setTitle("Ajouter Chambre");
        setSize(350, 330);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel numeroLabel = new JLabel("Numéro:");
        numeroLabel.setBounds(30, 30, 120, 25);
        add(numeroLabel);

        numeroField = new JTextField();
        numeroField.setBounds(150, 30, 150, 25);
        add(numeroField);

        JLabel typeLabel = new JLabel("Type:");
        typeLabel.setBounds(30, 70, 120, 25);
        add(typeLabel);

        typeField = new JTextField();
        typeField.setBounds(150, 70, 150, 25);
        add(typeField);

        JLabel etageLabel = new JLabel("Étage:");
        etageLabel.setBounds(30, 110, 120, 25);
        add(etageLabel);

        etageField = new JTextField();
        etageField.setBounds(150, 110, 150, 25);
        add(etageField);

        JLabel prixLabel = new JLabel("Prix/Nuit:");
        prixLabel.setBounds(30, 150, 120, 25);
        add(prixLabel);

        prixField = new JTextField();
        prixField.setBounds(150, 150, 150, 25);
        add(prixField);

        JLabel statutLabel = new JLabel("Statut:");
        statutLabel.setBounds(30, 190, 120, 25);
        add(statutLabel);

        statutField = new JTextField();
        statutField.setBounds(150, 190, 150, 25);
        add(statutField);

        ajouterButton = new JButton("Ajouter");
        ajouterButton.setBounds(110, 240, 120, 30);
        add(ajouterButton);
    }
}
