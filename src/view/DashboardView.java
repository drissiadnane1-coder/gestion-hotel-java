package view;

import javax.swing.JButton;	

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import controller.ChambreMenuController;
import controller.ClientMenuController;
import controller.ReservationMenuController;
import controller.PaiementMenuController;

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
        
        paiementsButton.addActionListener(e -> {

            PaiementMenuView menuView = new PaiementMenuView();

            new PaiementMenuController(menuView);

            menuView.setVisible(true);
        });


        logoutButton = new JButton("Déconnexion");
        logoutButton.setBounds(100, 270, 180, 30);
        add(logoutButton);
        logoutButton.addActionListener(e -> {
            // 1. Demander confirmation avant de tout fermer
            int choix = JOptionPane.showConfirmDialog(
                    this, 
                    "Êtes-vous sûr de vouloir quitter l'application ?",
                    "Confirmation de sortie",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.WARNING_MESSAGE // Icône d'avertissement
            );

            // 2. Si l'utilisateur clique sur "Oui"
            if (choix == JOptionPane.YES_OPTION) {
                // Arrête immédiatement l'exécution de tout le programme Java
                System.exit(0); 
            }
        });
    }
}