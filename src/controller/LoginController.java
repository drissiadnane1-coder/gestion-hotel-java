package controller;

import javax.swing.JOptionPane;

import dao.UtilisateurDAO;
import view.DashboardView;
import view.LoginView;

public class LoginController {

    private LoginView loginView;
    private UtilisateurDAO utilisateurDAO;

    public LoginController(LoginView loginView) {
        this.loginView = loginView;
        this.utilisateurDAO = new UtilisateurDAO();

        this.loginView.loginButton.addActionListener(e -> login());
    }

    private void login() {
        String username = loginView.usernameField.getText();
        String password = new String(loginView.passwordField.getPassword());

        boolean success = utilisateurDAO.login(username, password);

        if (success) {
            JOptionPane.showMessageDialog(loginView, "Connexion réussie !");
            loginView.dispose();

            DashboardView dashboard = new DashboardView();
            dashboard.setVisible(true);

        } else {
            JOptionPane.showMessageDialog(loginView, "Username ou password incorrect !");
        }
    }
}
