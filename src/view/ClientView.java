package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class ClientView extends JFrame {

    public JTextField idField, nomField, prenomField, telephoneField, emailField, adresseField, pieceIdentiteField;
    public JButton ajouterButton, modifierButton, supprimerButton, actualiserButton;
    public JTable clientTable;
    public DefaultTableModel tableModel;

    public ClientView() {
        setTitle("Gestion Clients");
        setSize(800, 500);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID:");
        idLabel.setBounds(20, 20, 100, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(130, 20, 150, 25);
        add(idField);

        JLabel nomLabel = new JLabel("Nom:");
        nomLabel.setBounds(20, 60, 100, 25);
        add(nomLabel);

        nomField = new JTextField();
        nomField.setBounds(130, 60, 150, 25);
        add(nomField);

        JLabel prenomLabel = new JLabel("Prénom:");
        prenomLabel.setBounds(20, 100, 100, 25);
        add(prenomLabel);

        prenomField = new JTextField();
        prenomField.setBounds(130, 100, 150, 25);
        add(prenomField);

        JLabel telLabel = new JLabel("Téléphone:");
        telLabel.setBounds(20, 140, 100, 25);
        add(telLabel);

        telephoneField = new JTextField();
        telephoneField.setBounds(130, 140, 150, 25);
        add(telephoneField);

        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 180, 100, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(130, 180, 150, 25);
        add(emailField);

        JLabel adresseLabel = new JLabel("Adresse:");
        adresseLabel.setBounds(20, 220, 100, 25);
        add(adresseLabel);

        adresseField = new JTextField();
        adresseField.setBounds(130, 220, 150, 25);
        add(adresseField);

        JLabel pieceLabel = new JLabel("Pièce identité:");
        pieceLabel.setBounds(20, 260, 100, 25);
        add(pieceLabel);

        pieceIdentiteField = new JTextField();
        pieceIdentiteField.setBounds(130, 260, 150, 25);
        add(pieceIdentiteField);

        ajouterButton = new JButton("Ajouter");
        ajouterButton.setBounds(20, 320, 100, 30);
        add(ajouterButton);

        modifierButton = new JButton("Modifier");
        modifierButton.setBounds(130, 320, 100, 30);
        add(modifierButton);

        supprimerButton = new JButton("Supprimer");
        supprimerButton.setBounds(240, 320, 110, 30);
        add(supprimerButton);

        actualiserButton = new JButton("Actualiser");
        actualiserButton.setBounds(360, 320, 110, 30);
        add(actualiserButton);

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[] {
            "ID", "Nom", "Prénom", "Téléphone", "Email", "Adresse", "Pièce identité"
        });

        clientTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(clientTable);
        scrollPane.setBounds(310, 20, 450, 270);
        add(scrollPane);
    }
}