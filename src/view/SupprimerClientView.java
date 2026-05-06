package view;

import javax.swing.*;

public class SupprimerClientView extends JFrame {

    public JTextField idField;
    public JButton supprimerButton;

    public SupprimerClientView() {
        setTitle("Supprimer Client");
        setSize(320, 180);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID Client:");
        idLabel.setBounds(30, 40, 100, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(130, 40, 130, 25);
        add(idField);

        supprimerButton = new JButton("Supprimer");
        supprimerButton.setBounds(100, 90, 120, 30);
        add(supprimerButton);
    }
}
