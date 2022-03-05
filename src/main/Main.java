package main;

import screens.login.LoginScreen;
import screens.mainMenu.MainMenu;

import javax.swing.*;
import java.awt.*;

public class Main {
  public static void main(String[] args) {
    LoginScreen loginScreen = new LoginScreen();
    loginScreen.setVisible(true);
  }
}