package screens.login;

import javax.swing.*;
import java.awt.*;

public class LoginScreen extends JFrame {
  private JPanel loginScreen;
  private JPanel loginHeader;
  private JPanel loginContainer;
  private JTextField usernameInput;
  private JPasswordField passwordInput;
  private JComboBox positionInput;
  private JButton loginButton;

  public LoginScreen() {

  }

  public static void main(String[] args) {
    LoginScreen lS = new LoginScreen();
    lS.setTitle("Login");
    lS.getContentPane().add(lS.loginScreen, BorderLayout.CENTER);
    lS.setSize(790, 410);
    lS.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    lS.setVisible(true);
  }

}
