package main;

import javax.swing.*;

public class Main {
  public static void main(String[] args) {
    JPanel jPanel = new JPanel();
    JFrame jFrame = new JFrame();

    jFrame.setSize(1024, 768);
    jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    jFrame.add(jPanel);

    jPanel.setLayout(null);

    jFrame.setVisible(true);
  }
}