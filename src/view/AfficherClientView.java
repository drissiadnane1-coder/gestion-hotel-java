package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AfficherClientView extends JFrame {

    public JTable clientTable;
    public DefaultTableModel tableModel;
    public JButton actualiserButton;

    public AfficherClientView() {
        setTitle("Liste des Clients");
        setSize(800, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        tableModel = new DefaultTableModel();
        tableModel.setColumnIdentifiers(new String[] {
            "ID", "Nom", "Prénom", "Téléphone", "Email", "Adresse", "Pièce identité"
        });

        clientTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(clientTable);
        scrollPane.setBounds(20, 20, 740, 280);
        add(scrollPane);

        actualiserButton = new JButton("Actualiser");
        actualiserButton.setBounds(330, 320, 120, 30);
        add(actualiserButton);
    }
}
