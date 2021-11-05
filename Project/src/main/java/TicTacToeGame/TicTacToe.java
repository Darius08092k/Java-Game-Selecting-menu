package TicTacToeGame;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.FileWriter;
import java.io.IOException;

public class TicTacToe implements ActionListener{
    JFrame panel = new JFrame();
    JTextField textField1 = new JTextField();
    JTextField textField2 = new JTextField();
    JTextField textField3 = new JTextField();
    JTextField textField4 = new JTextField();
    JTextField textField5 = new JTextField();
    JTextField textField6 = new JTextField();
    JTextField textField7 = new JTextField();
    JTextField textField8 = new JTextField();
    JTextField textField9 = new JTextField();
    JButton player1Button = new JButton("X Player");
    JTextArea textArea1 = new JTextArea();
    JButton player2Button = new JButton("O Player");
    JTextField textField10 = new JTextField();
    JLabel Information = new JLabel();
    FileWriter writerTicTacToe;

    {
        try {
            writerTicTacToe = new FileWriter("TicTacToe.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void WriteToFile(int i){
        try {
            writerTicTacToe.append("Player ").append(String.valueOf(i)).append(" wins! \n");
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            writerTicTacToe.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public TicTacToe()  {

        Information.setBounds(10,10,500,50);
        Information.setFont(new Font(null, Font.BOLD,20));
        Information.setText("Please make sure you have CAPS LOCK pressed!");

        textField1.setBounds(100,100,50,40);
        textField2.setBounds(200,100,50,40);
        textField3.setBounds(300,100,50,40);
        textField4.setBounds(100,200,50,40);
        textField5.setBounds(200,200,50,40);
        textField6.setBounds(300,200,50,40);
        textField7.setBounds(100,300,50,40);
        textField8.setBounds(200,300,50,40);
        textField9.setBounds(300,300,50,40);
        textField10.setBounds(175,400,100,40);


        player1Button.setBounds(50,350,100,40);
        player1Button.addActionListener(this);
        player2Button.setBounds(300,350,100,40);
        player2Button.addActionListener(this);

        panel.add(Information);
        panel.add(textField1);
        panel.add(textField2);
        panel.add(textField3);
        panel.add(textField4);
        panel.add(textField5);
        panel.add(textField6);
        panel.add(textField7);
        panel.add(textField8);
        panel.add(textField9);
        panel.add(textField10);
        panel.add(player1Button);
        panel.add(player2Button);
        panel.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panel.setSize(500, 500);
        panel.setLayout(null);
        panel.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==player1Button)
        {
            if(textField1.getText().contains("X") || textField1.getText().contains("x")) {
                textField1.setEditable(false);
            }
            if(textField2.getText().contains("X") || textField2.getText().contains("x")){
                textField2.setEditable(false);
            }
            if(textField3.getText().contains("X") || textField3.getText().contains("x")){
                textField3.setEditable(false);
            }
            if(textField4.getText().contains("X") || textField4.getText().contains("x")){
                textField4.setEditable(false);
            }
            if(textField5.getText().contains("X") || textField5.getText().contains("x")){
                textField5.setEditable(false);
            }
            if(textField6.getText().contains("X") || textField6.getText().contains("x")){
                textField6.setEditable(false);
            }
            if(textField7.getText().contains("X") || textField7.getText().contains("x")){
                textField7.setEditable(false);
            }
            if(textField8.getText().contains("X") || textField8.getText().contains("x")){
                textField8.setEditable(false);
            }
            if(textField9.getText().contains("X") || textField9.getText().contains("x")){
                textField9.setEditable(false);
            }
            //ORIZONTAL
            if((textField1.getText().contains("X")&&textField2.getText().contains("X")&&textField3.getText().contains("X"))){
                WriteToFile(1);
                textField4.setEditable(false);
                textField5.setEditable(false);
                textField6.setEditable(false);
                textField7.setEditable(false);
                textField8.setEditable(false);
                textField9.setEditable(false);
                textField10.setEditable(false);
            }
            if(textField4.getText().contains("X")&&textField5.getText().contains("X")&&textField6.getText().contains("X")){
                WriteToFile(1);
                textField1.setEditable(false);
                textField2.setEditable(false);
                textField3.setEditable(false);
                textField7.setEditable(false);
                textField8.setEditable(false);
                textField9.setEditable(false);
                textField10.setEditable(false);
            }
            if(textField7.getText().contains("X")&&textField8.getText().contains("X")&&textField9.getText().contains("X")){
                WriteToFile(1);
                textField1.setEditable(false);
                textField2.setEditable(false);
                textField3.setEditable(false);
                textField4.setEditable(false);
                textField5.setEditable(false);
                textField6.setEditable(false);
                textField10.setEditable(false);
            }
            //VERTICAL
            if(textField1.getText().contains("X")&&textField4.getText().contains("X")&&textField7.getText().contains("X")){
                WriteToFile(1);
                textField2.setEditable(false);
                textField3.setEditable(false);
                textField5.setEditable(false);
                textField6.setEditable(false);
                textField8.setEditable(false);
                textField9.setEditable(false);
                textField10.setEditable(false);
            }
            if(textField2.getText().contains("X")&&textField5.getText().contains("X")&&textField8.getText().contains("X")){
                WriteToFile(1);
                textField1.setEditable(false);
                textField3.setEditable(false);
                textField4.setEditable(false);
                textField6.setEditable(false);
                textField7.setEditable(false);
                textField9.setEditable(false);
                textField10.setEditable(false);
            }
            if(textField3.getText().contains("X")&&textField6.getText().contains("X")&&textField9.getText().contains("X")){
                WriteToFile(1);
                textField1.setEditable(false);
                textField2.setEditable(false);
                textField4.setEditable(false);
                textField5.setEditable(false);
                textField7.setEditable(false);
                textField8.setEditable(false);
                textField10.setEditable(false);
            }
            //DIAGONAL
            if(textField3.getText().contains("X")&&textField5.getText().contains("X")&&textField7.getText().contains("X")){
                WriteToFile(1);
                textField1.setEditable(false);
                textField2.setEditable(false);
                textField4.setEditable(false);
                textField6.setEditable(false);
                textField8.setEditable(false);
                textField9.setEditable(false);
                textField10.setEditable(false);
            }
            if(textField1.getText().contains("X")&&textField5.getText().contains("X")&&textField9.getText().contains("X")){
                WriteToFile(1);
                textField2.setEditable(false);
                textField3.setEditable(false);
                textField4.setEditable(false);
                textField6.setEditable(false);
                textField7.setEditable(false);
                textField8.setEditable(false);
                textField10.setEditable(false);
            }

        }
        else{
            if(e.getSource()==player2Button){
                if(textField1.getText().contains("O")) {
                    textField1.setEditable(false);
                }
                if(textField2.getText().contains("O")){
                    textField2.setEditable(false);
                }
                if(textField3.getText().contains("O")){
                    textField3.setEditable(false);
                }
                if(textField4.getText().contains("O")){
                    textField4.setEditable(false);
                }
                if(textField5.getText().contains("O")){
                    textField5.setEditable(false);
                }
                if(textField6.getText().contains("O")){
                    textField6.setEditable(false);
                }
                if(textField7.getText().contains("O")){
                    textField7.setEditable(false);
                }
                if(textField8.getText().contains("O")){
                    textField8.setEditable(false);
                }
                if(textField9.getText().contains("O")){
                    textField9.setEditable(false);
                }
                //ORIZONTAL
                if((textField1.getText().contains("O")&&textField2.getText().contains("O")&&textField3.getText().contains("O"))){
                    WriteToFile(2);
                    textField4.setEditable(false);
                    textField5.setEditable(false);
                    textField6.setEditable(false);
                    textField7.setEditable(false);
                    textField8.setEditable(false);
                    textField9.setEditable(false);
                    textField10.setEditable(false);
                }
                if(textField4.getText().contains("O")&&textField5.getText().contains("O")&&textField6.getText().contains("O")){
                    WriteToFile(2);
                    textField1.setEditable(false);
                    textField2.setEditable(false);
                    textField3.setEditable(false);
                    textField7.setEditable(false);
                    textField8.setEditable(false);
                    textField9.setEditable(false);
                    textField10.setEditable(false);
                }
                if(textField7.getText().contains("O")&&textField8.getText().contains("O")&&textField9.getText().contains("O")){
                    WriteToFile(2);
                    textField1.setEditable(false);
                    textField2.setEditable(false);
                    textField3.setEditable(false);
                    textField4.setEditable(false);
                    textField5.setEditable(false);
                    textField6.setEditable(false);
                    textField10.setEditable(false);
                }
                //VERTICAL
                if(textField1.getText().contains("O")&&textField4.getText().contains("O")&&textField7.getText().contains("O")){
                    WriteToFile(2);
                    textField2.setEditable(false);
                    textField3.setEditable(false);
                    textField5.setEditable(false);
                    textField6.setEditable(false);
                    textField8.setEditable(false);
                    textField9.setEditable(false);
                    textField10.setEditable(false);
                }
                if(textField2.getText().contains("O")&&textField5.getText().contains("O")&&textField8.getText().contains("O")){
                    WriteToFile(2);
                    textField1.setEditable(false);
                    textField3.setEditable(false);
                    textField4.setEditable(false);
                    textField6.setEditable(false);
                    textField7.setEditable(false);
                    textField9.setEditable(false);
                    textField10.setEditable(false);
                }
                if(textField3.getText().contains("O")&&textField6.getText().contains("O")&&textField9.getText().contains("O")){
                    WriteToFile(2);
                    textField1.setEditable(false);
                    textField2.setEditable(false);
                    textField4.setEditable(false);
                    textField5.setEditable(false);
                    textField7.setEditable(false);
                    textField8.setEditable(false);
                    textField10.setEditable(false);
                }
                //DIAGONAL
                if(textField3.getText().contains("O")&&textField5.getText().contains("O")&&textField7.getText().contains("O")){
                    WriteToFile(2);
                    textField1.setEditable(false);
                    textField2.setEditable(false);
                    textField4.setEditable(false);
                    textField6.setEditable(false);
                    textField8.setEditable(false);
                    textField9.setEditable(false);
                    textField10.setEditable(false);
                }
                if(textField1.getText().contains("O")&&textField5.getText().contains("O")&&textField9.getText().contains("O")){
                    WriteToFile(2);
                    textField2.setEditable(false);
                    textField3.setEditable(false);
                    textField4.setEditable(false);
                    textField6.setEditable(false);
                    textField7.setEditable(false);
                    textField8.setEditable(false);
                    textField10.setEditable(false);
                }
            }
            }
        }
    }

