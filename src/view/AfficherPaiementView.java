package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AfficherPaiementView extends JFrame {

    public JTable paiementTable;
    public DefaultTableModel tableModel;

    public JButton actualiserButton;

    public AfficherPaiementView() {

        setTitle("Liste Paiements");
        setSize(850, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        tableModel = new DefaultTableModel();

        tableModel.setColumnIdentifiers(new String[] {
                "ID",
                "Reservation ID",
                "Date Paiement",
                "Montant",
                "Mode Paiement"
        });

        paiementTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(paiementTable);
        scrollPane.setBounds(20, 20, 790, 260);
        add(scrollPane);

        actualiserButton = new JButton("Actualiser");
        actualiserButton.setBounds(350, 300, 130, 30);
        add(actualiserButton);
    }
}