package view;

import javax.swing.*;

public class AjouterClientView extends JFrame {

    public JTextField nomField, prenomField, telephoneField, emailField, adresseField, pieceIdentiteField;
    public JButton ajouterButton;

    public AjouterClientView() {
        setTitle("Ajouter Client");
        setSize(350, 350);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel nomLabel = new JLabel("Nom:");
        nomLabel.setBounds(30, 30, 120, 25);
        add(nomLabel);

        nomField = new JTextField();
        nomField.setBounds(150, 30, 150, 25);
        add(nomField);

        JLabel prenomLabel = new JLabel("Prénom:");
        prenomLabel.setBounds(30, 70, 120, 25);
        add(prenomLabel);

        prenomField = new JTextField();
        prenomField.setBounds(150, 70, 150, 25);
        add(prenomField);

        JLabel telLabel = new JLabel("Téléphone:");
        telLabel.setBounds(30, 110, 120, 25);
        add(telLabel);

        telephoneField = new JTextField();
        telephoneField.setBounds(150, 110, 150, 25);
        add(telephoneField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(30, 150, 120, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(150, 150, 150, 25);
        add(emailField);

        JLabel adresseLabel = new JLabel("Adresse:");
        adresseLabel.setBounds(30, 190, 120, 25);
        add(adresseLabel);

        adresseField = new JTextField();
        adresseField.setBounds(150, 190, 150, 25);
        add(adresseField);

        JLabel pieceLabel = new JLabel("Pièce identité:");
        pieceLabel.setBounds(30, 230, 120, 25);
        add(pieceLabel);

        pieceIdentiteField = new JTextField();
        pieceIdentiteField.setBounds(150, 230, 150, 25);
        add(pieceIdentiteField);

        ajouterButton = new JButton("Ajouter");
        ajouterButton.setBounds(110, 270, 120, 30);
        add(ajouterButton);
    }
}
