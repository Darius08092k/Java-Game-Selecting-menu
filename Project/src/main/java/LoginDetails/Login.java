package LoginDetails;

import MainPage.SelectPage;

import javax.swing.*;
import java.awt.*;

public class Login {

    JFrame frame = new JFrame();
    JLabel Welcome = new JLabel("Welcome");

    Login(String Username){

        Welcome.setBounds(10,5,200,35);
        Welcome.setFont(new Font(null, Font.ITALIC,20));
        Welcome.setText("Hello "+Username+" !");


        frame.add(Welcome);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(100,100);
        frame.setLayout(null);
        frame.setVisible(true);
    }

}
