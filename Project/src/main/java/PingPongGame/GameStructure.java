package PingPongGame;

import javax.swing.*;
import java.awt.*;

public class GameStructure extends JFrame {

    Gameplay panel;

    GameStructure(){
        panel = new Gameplay();
        this.add(panel);
        this.setResizable(false);
        this.setBackground(Color.BLACK);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

}
