package SnakeGame;

import javax.swing.*;
import java.awt.*;

public class Frame extends JFrame {

    JLabel information = new JLabel();

    Frame(){
        information.setBounds(100,100,40,40);
        information.setFont(new Font(null, Font.BOLD,25));
        information.setText("Game in developement");

        this.add(new Panel());
        this.add(information);
        this.setTitle("Snek");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);

    }


}
