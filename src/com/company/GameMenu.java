package com.company;


import javax.swing.*;
import java.awt.*;

public class GameMenu extends JPanel {
    GamePanel panel;
    static final int SPACE_LINE = 20;
    static final int GAME_WIDTH = 1000;
    static final int GAME_HEIGHT = (int)(GAME_WIDTH * (0.5555));
    static final Dimension SCREEN_SIZE = new Dimension(GAME_WIDTH,GAME_HEIGHT);

    public GameMenu(){
        this.setPreferredSize(SCREEN_SIZE);
       JPanel buttonPanel = new JPanel();
        JButton startButton = new JButton("התחלת המשחק");
        JButton instructionsButton = new JButton("הוראות המשחק");
        instructionsButton.addActionListener(e -> {
            JFrame frame = new JFrame();
            frame.setLayout(null);
            frame.setSize(700,500);
            frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            frame.setLocationRelativeTo(null);

            JLabel line1 = new JLabel("הוראות המשחק:");
            line1.setBounds(300,10,200,50);
            frame.add(line1);

            JLabel line2 = new JLabel("כללי המשחק פשוטים ודומים לאלו של טניס שולחן:");
            line2.setBounds(220,line1.getY()+SPACE_LINE+15,GAME_WIDTH,50);
            frame.add(line2);

            JLabel line3 = new JLabel("הכדור נע על המסך מצד לצד והשחקנים, אשר שולטים במחבטים, צריכים להזיז אותם מעלה או מטה כדי שהכדור יפגע במחבט.");
            line3.setBounds(20,line2.getY()+SPACE_LINE,GAME_WIDTH,50);
            frame.add(line3);

            JLabel line4 = new JLabel("במקרה ששחקן מסוים אינו מצליח לחבוט בכדור, השחקן השני זוכה בנקודה.");
            line4.setBounds(130,line3.getY()+SPACE_LINE,GAME_WIDTH,50);
            frame.add(line4);

            JLabel line5 = new JLabel("השחקן המנצח זה השחקן הראשון שהגיע ל5 נקודות.");
            line5.setBounds(line2.getX(),line4.getY()+SPACE_LINE,GAME_WIDTH,50);
            frame.add(line5);

            JLabel line6 = new JLabel("השחקן בצד ימין זז בעזרת החצים והשחקן בצד שמאל זז בעזרת W לעלות למעלה ו S כדי לרדת למטה.");
            line6.setBounds(110,line5.getY()+SPACE_LINE,GAME_WIDTH,50);
            frame.add(line6);

            JLabel line7 = new JLabel("המשחק הוא ברמת קושי עולה, מהירות הכדור הולכה ועולה עם החבטות בכדור.");
            line7.setBounds(130,line6.getY()+SPACE_LINE,GAME_WIDTH,50);
            frame.add(line7);

            frame.setBackground(Color.WHITE);
            frame.setTitle("הוראות המשחק");
            frame.setVisible(true);

        });
        buttonPanel.add(startButton);
        buttonPanel.add(instructionsButton);
        add(buttonPanel,BorderLayout.CENTER);
        ImageIcon imageIcon = new ImageIcon("DD.jpg");
        JLabel label = new JLabel(imageIcon);
        add(label);
        startButton.addActionListener(e -> {
            panel = new GamePanel();
            this.add(panel);
            startButton.setVisible(false);
            remove(buttonPanel);
            remove(label);
        });
    }
}
