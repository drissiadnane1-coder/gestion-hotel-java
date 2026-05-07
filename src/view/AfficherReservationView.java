package view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class AfficherReservationView extends JFrame {

    public JTable reservationTable;
    public DefaultTableModel tableModel;

    public JButton actualiserButton;

    public AfficherReservationView() {

        setTitle("Liste Réservations");
        setSize(850, 400);
        setLocationRelativeTo(null);
        setLayout(null);

        tableModel = new DefaultTableModel();

        tableModel.setColumnIdentifiers(new String[] {
                "ID",
                "Client ID",
                "Chambre ID",
                "Date Début",
                "Date Fin",
                "Statut"
        });

        reservationTable = new JTable(tableModel);

        JScrollPane scrollPane = new JScrollPane(reservationTable);
        scrollPane.setBounds(20, 20, 790, 260);
        add(scrollPane);

        actualiserButton = new JButton("Actualiser");
        actualiserButton.setBounds(350, 300, 130, 30);
        add(actualiserButton);
    }
}