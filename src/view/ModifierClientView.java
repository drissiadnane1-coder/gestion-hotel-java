package view;

import javax.swing.*;

public class ModifierClientView extends JFrame {

    public JTextField idField, nomField, prenomField, telephoneField, emailField, adresseField, pieceIdentiteField;
    public JButton modifierButton;

    public ModifierClientView() {
        setTitle("Modifier Client");
        setSize(350, 390);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(30, 20, 120, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(150, 20, 150, 25);
        add(idField);

        JLabel nomLabel = new JLabel("Nom:");
        nomLabel.setBounds(30, 60, 120, 25);
        add(nomLabel);

        nomField = new JTextField();
        nomField.setBounds(150, 60, 150, 25);
        add(nomField);

        JLabel prenomLabel = new JLabel("Prénom:");
        prenomLabel.setBounds(30, 100, 120, 25);
        add(prenomLabel);

        prenomField = new JTextField();
        prenomField.setBounds(150, 100, 150, 25);
        add(prenomField);

        JLabel telLabel = new JLabel("Téléphone:");
        telLabel.setBounds(30, 140, 120, 25);
        add(telLabel);

        telephoneField = new JTextField();
        telephoneField.setBounds(150, 140, 150, 25);
        add(telephoneField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 180, 120, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 180, 150, 25);
        add(emailField);

        JLabel adresseLabel = new JLabel("Adresse:");
        adresseLabel.setBounds(30, 220, 120, 25);
        add(adresseLabel);

        adresseField = new JTextField();
        adresseField.setBounds(150, 220, 150, 25);
        add(adresseField);

        JLabel pieceLabel = new JLabel("Pièce identité:");
        pieceLabel.setBounds(30, 260, 120, 25);
        add(pieceLabel);

        pieceIdentiteField = new JTextField();
        pieceIdentiteField.setBounds(150, 260, 150, 25);
        add(pieceIdentiteField);

        modifierButton = new JButton("Modifier");
        modifierButton.setBounds(110, 310, 120, 30);
        add(modifierButton);
    }
}