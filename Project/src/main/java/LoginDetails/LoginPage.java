package LoginDetails;

import MainPage.SelectPage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

public class LoginPage implements ActionListener {

    JFrame panel = new JFrame();
    JButton loginButton = new JButton("Login");
    JButton clearButton = new JButton("Clear");
    JTextField usernameField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JLabel labelUsername = new JLabel("Username:");
    JLabel labelPassword = new JLabel("Password:");
    JLabel message = new JLabel();
    JPanel gameplay = new JPanel();
    HashMap<String,String> infologin= new HashMap<String,String>();

    public LoginPage(HashMap<String, String> loginOriginal){

        infologin = loginOriginal;

        labelUsername.setBounds(20,40,70,20);
        labelPassword.setBounds(20,80,70,20);
        message.setBounds(150,150,300,200);

        usernameField.setBounds(100,40,200,20);
        passwordField.setBounds(100,80,200,20);

        loginButton.setBounds(50,150,100,25);
        loginButton.addActionListener(this);
        clearButton.setBounds(200,150,100,25);
        clearButton.addActionListener(this);

        panel.add(labelUsername);
        panel.add(labelPassword);
        panel.add(message);
        panel.add(usernameField);
        panel.add(passwordField);
        panel.add(loginButton);
        panel.add(clearButton);
        panel.add(gameplay);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(400,400);
        panel.setLayout(null);
        panel.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==clearButton){

             usernameField.setText("");
             passwordField.setText("");

         }

         if(e.getSource()==loginButton){

             String Username = usernameField.getText();
             String Password = String.valueOf(passwordField.getPassword());

             if(infologin.containsKey(Username)){
                 if(infologin.get(Username).equals(Password)){
                     message.setForeground(Color.green);
                     message.setText("Login sucessful");
                     panel.dispose();
                     Login Welcome = new Login(Username);
                     SelectPage select = new SelectPage();
                 }
                 else{
                     message.setForeground(Color.red);
                     message.setText("Wrong Username or Password");
                 }
             }
             else{
                 message.setForeground(Color.red);
                 message.setText("Wrong Username or Password");
             }

         }
    }
}
