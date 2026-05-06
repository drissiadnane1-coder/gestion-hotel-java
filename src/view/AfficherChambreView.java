package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AfficherChambreView extends JFrame {

    public JTable chambreTable;
    public DefaultTableModel tableModel;
    public JButton actualiserButton;

    public AfficherChambreView() {
        setTitle("Liste des Chambres");
        setSize(750, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[] {
            "ID", "Numéro", "Type", "Étage", "Prix/Nuit", "Statut"
        });

        chambreTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(chambreTable);
        scrollPane.setBounds(20, 20, 690, 280);
        add(scrollPane);

        actualiserButton = new JButton("Actualiser");
        actualiserButton.setBounds(300, 320, 120, 30);
        add(actualiserButton);
    }
}