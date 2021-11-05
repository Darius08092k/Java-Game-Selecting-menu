package MainPage;

import PingPongGame.PingPong;
import SnakeGame.Snake;
import TicTacToeGame.TicTacToe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SelectPage implements ActionListener {

    JFrame panel = new JFrame();
    JLabel select = new JLabel("Welcome");
    JButton TicTacToeButton = new JButton("Tic Tac Toe");
    JButton SnakeButton = new JButton("Snake");
    JButton PingPongButton = new JButton("Ping Pong");

    public SelectPage() {

        select.setBounds(130, 10, 200, 40);
        select.setFont(new Font(null, Font.BOLD, 25));
        select.setText("Pick a game");

        TicTacToeButton.setBounds(50, 60, 100, 25);
        TicTacToeButton.addActionListener(this);
        SnakeButton.setBounds(250, 60, 100, 25);
        SnakeButton.addActionListener(this);
        PingPongButton.setBounds(50, 150, 100, 25);
        PingPongButton.addActionListener(this);

        panel.add(select);
        panel.add(TicTacToeButton);
        panel.add(SnakeButton);
        panel.add(PingPongButton);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(400, 400);
        panel.setLayout(null);
        panel.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==TicTacToeButton){
            TicTacToe xAnd0 = new TicTacToe();
            panel.dispose();
        }
        if(e.getSource()==SnakeButton){
            Snake snek = new Snake();
            panel.dispose();
        }
        if(e.getSource()==PingPongButton){
            PingPong pingpong = new PingPong();
            panel.dispose();
        }


    }
}
