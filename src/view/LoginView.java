package view;

import javax.swing.*;

public class LoginView extends JFrame {

    public JTextField usernameField;
    public JPasswordField passwordField;
    public JButton loginButton;

    public LoginView() {
        setTitle("Connexion - Gestion Hôtel");
        setSize(350, 220);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel usernameLabel = new JLabel("Username:");
        usernameLabel.setBounds(40, 40, 100, 25);
        add(usernameLabel);

        usernameField = new JTextField();
        usernameField.setBounds(140, 40, 150, 25);
        add(usernameField);

        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(40, 80, 100, 25);
        add(passwordLabel);

        passwordField = new JPasswordField();
        passwordField.setBounds(140, 80, 150, 25);
        add(passwordField);

        loginButton = new JButton("Se connecter");
        loginButton.setBounds(110, 130, 130, 30);
        add(loginButton);
    }
}
