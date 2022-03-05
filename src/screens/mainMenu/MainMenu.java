package screens.mainMenu;

import javax.swing.*;
import java.awt.*;

public class MainMenu extends JFrame {
  private JPanel mainMenuScreen;
  private JPanel mainMenuHeader;
  private JPanel mainMenuContainer;
  private JButton updateSalaryButton;
  private JButton logoutButton;
  private JButton employeeManagerButton;
  private JButton searchButton;
  private JButton allowanceButton;
  private JButton paymentButton;

  public MainMenu() {
    setTitle("Main Menu");
    getContentPane().add(mainMenuScreen, BorderLayout.CENTER);
    setSize(790, 410);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  }

  public static void main(String[] args) {
    new MainMenu();
  }
}
