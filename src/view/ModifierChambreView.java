package view;

import javax.swing.*;

public class ModifierChambreView extends JFrame {

    public JTextField idField, numeroField, typeField, etageField, prixField, statutField;
    public JButton modifierButton;

    public ModifierChambreView() {
        setTitle("Modifier Chambre");
        setSize(350, 370);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(30, 20, 120, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(150, 20, 150, 25);
        add(idField);

        JLabel numeroLabel = new JLabel("Numéro:");
        numeroLabel.setBounds(30, 60, 120, 25);
        add(numeroLabel);

        numeroField = new JTextField();
        numeroField.setBounds(150, 60, 150, 25);
        add(numeroField);

        JLabel typeLabel = new JLabel("Type:");
        typeLabel.setBounds(30, 100, 120, 25);
        add(typeLabel);

        typeField = new JTextField();
        typeField.setBounds(150, 100, 150, 25);
        add(typeField);

        JLabel etageLabel = new JLabel("Étage:");
        etageLabel.setBounds(30, 140, 120, 25);
        add(etageLabel);

        etageField = new JTextField();
        etageField.setBounds(150, 140, 150, 25);
        add(etageField);

        JLabel prixLabel = new JLabel("Prix/Nuit:");
        prixLabel.setBounds(30, 180, 120, 25);
        add(prixLabel);

        prixField = new JTextField();
        prixField.setBounds(150, 180, 150, 25);
        add(prixField);

        JLabel statutLabel = new JLabel("Statut:");
        statutLabel.setBounds(30, 220, 120, 25);
        add(statutLabel);

        statutField = new JTextField();
        statutField.setBounds(150, 220, 150, 25);
        add(statutField);

        modifierButton = new JButton("Modifier");
        modifierButton.setBounds(110, 280, 120, 30);
        add(modifierButton);
    }
}
