package view;

import javax.swing.*;

public class SupprimerReservationView extends JFrame {

    public JTextField idField;
    public JButton supprimerButton;

    public SupprimerReservationView() {

        setTitle("Supprimer Réservation");
        setSize(320, 180);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel idLabel = new JLabel("ID Réservation:");
        idLabel.setBounds(30, 40, 120, 25);
        add(idLabel);

        idField = new JTextField();
        idField.setBounds(160, 40, 120, 25);
        add(idField);

        supprimerButton = new JButton("Supprimer");
        supprimerButton.setBounds(100, 90, 120, 30);
        add(supprimerButton);
    }
}
