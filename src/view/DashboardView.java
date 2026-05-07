package view;

import javax.swing.JButton;

import javax.swing.JFrame;
import javax.swing.JLabel;

import controller.ChambreMenuController;
import controller.ClientMenuController;
import controller.ReservationMenuController;

public class DashboardView extends JFrame {

    public JButton clientsButton;
    public JButton chambresButton;
    public JButton reservationsButton;
    public JButton paiementsButton;
    public JButton hotelButton;
    public JButton logoutButton;

    public DashboardView() {
        setTitle("Dashboard - Gestion Hôtel");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel titleLabel = new JLabel("Gestion Hôtel");
        titleLabel.setBounds(145, 20, 150, 30);
        add(titleLabel);

        clientsButton = new JButton("Gestion Clients");
        clientsButton.setBounds(100, 70, 180, 30);
        add(clientsButton);

        clientsButton.addActionListener(e -> {
            ClientMenuView clientMenuView = new ClientMenuView();
            new ClientMenuController(clientMenuView);
            clientMenuView.setVisible(true);
        });

        chambresButton = new JButton("Gestion Chambres");
        chambresButton.setBounds(100, 110, 180, 30);
        add(chambresButton);

        chambresButton.addActionListener(e -> {
            ChambreMenuView chambreMenuView = new ChambreMenuView();
            new ChambreMenuController(chambreMenuView);
            chambreMenuView.setVisible(true);
        });
        reservationsButton = new JButton("Gestion Réservations");
        reservationsButton.setBounds(100, 150, 180, 30);
        add(reservationsButton);
        
        reservationsButton.addActionListener(e -> {

            ReservationMenuView menuView = new ReservationMenuView();

            new ReservationMenuController(menuView);

            menuView.setVisible(true);
        });

        paiementsButton = new JButton("Gestion Paiements");
        paiementsButton.setBounds(100, 190, 180, 30);
        add(paiementsButton);

        hotelButton = new JButton("Infos Hôtel");
        hotelButton.setBounds(100, 230, 180, 30);
        add(hotelButton);

        logoutButton = new JButton("Déconnexion");
        logoutButton.setBounds(100, 270, 180, 30);
        add(logoutButton);
    }
}