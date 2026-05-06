package view;

import javax.swing.*;

public class SupprimerChambreView extends JFrame {

    public JTextField idField;
    public JButton supprimerButton;

    public SupprimerChambreView() {
        setTitle("Supprimer Chambre");
        setSize(320, 180);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID Chambre:");
        idLabel.setBounds(30, 40, 100, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(140, 40, 130, 25);
        add(idField);

        supprimerButton = new JButton("Supprimer");
        supprimerButton.setBounds(100, 90, 120, 30);
        add(supprimerButton);
    }
}
