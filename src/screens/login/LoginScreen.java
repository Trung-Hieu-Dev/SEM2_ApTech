package screens.login;

import screens.mainMenu.MainMenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginScreen extends JFrame {
  private JPanel loginScreen;
  private JPanel loginHeader;
  private JPanel loginContainer;
  private JTextField usernameInput;
  private JPasswordField passwordInput;
  private JComboBox positionInput;
  private JButton loginButton;

  public LoginScreen() {
    setTitle("Login");
    getContentPane().add(loginScreen, BorderLayout.CENTER);
    setSize(790, 410);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    loginButton.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        dispose();
        MainMenu mainMenu = new MainMenu();
        mainMenu.setVisible(true);
      }
    });
  }

  public static void main(String[] args) {
    new LoginScreen();
  }
}
