package _08_calculator;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener {

    int numOne;
    int numTwo;
    int finalNumber;

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton multiply = new JButton();
    JButton add = new JButton();
    JButton divide = new JButton();
    JButton subtract = new JButton();
    JTextField input1 = new JTextField();
    JTextField input2 = new JTextField();

    public void createUI(){

    frame.add(panel);
    panel.add(multiply);
    panel.add(add);
    panel.add(divide);
    panel.add(subtract);
    frame.pack();


    add.addActionListener(this);
    multiply.addActionListener(this);
    divide.addActionListener(this);
    subtract.addActionListener(this);
    }

    public int add(){
    finalNumber = input1+=input2;


    }
    public int subtract(){

    }
    public int multiply(){

    }
    public int divide(){

    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == add){
        numOne = Integer.parseInt(input1);
        }
        else if(actionEvent.getSource() == subtract){

        }
        else if(actionEvent.getSource() == multiply){

        }
        else if(actionEvent.getSource() == divide){

        }


    }
}
