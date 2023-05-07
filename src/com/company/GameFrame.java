package com.company;
import java.awt.*;
import javax.swing.*;

public class GameFrame extends JFrame {

    GameMenu menu;

    GameFrame(){
        menu = new GameMenu();
        this.add(menu);
        this.setTitle("Pong Game");
        this.setResizable(false);

        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
}