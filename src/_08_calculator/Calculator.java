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
    JButton multiply = new JButton("multiply");
    JButton add = new JButton("add");
    JButton divide = new JButton("divide");
    JButton subtract = new JButton("subtract");
    JTextField input1 = new JTextField(20);
    JTextField input2 = new JTextField(20);

    public void createUI(){

    frame.setSize(500,500);
    frame.setVisible(true);
    frame.add(panel);
    add.setSize(50,40);
    panel.add(multiply);
    panel.add(add);
    panel.add(divide);
    panel.add(subtract);
    panel.add(input1);
    panel.add(input2);






    add.addActionListener(this);
    multiply.addActionListener(this);
    divide.addActionListener(this);
    subtract.addActionListener(this);
    }

    public int add(int numberOne, int numberTwo){
        finalNumber = numberOne += numberTwo;
        return finalNumber;
    }
    public int subtract(){

        return finalNumber;
    }
    public int multiply(){

        return finalNumber;
    }
    public int divide(){

        return finalNumber;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if(actionEvent.getSource() == add){
            String addTextOne = input1.getText();
            String addTextTwo = input2.getText();
            int addIntOne = Integer.parseInt(addTextOne);
            int addIntTwo = Integer.parseInt(addTextTwo);
            int addDisplayNumber = add(addIntOne, addIntTwo);
            JOptionPane.showMessageDialog(null, addDisplayNumber);

        }
        else if(actionEvent.getSource() == subtract){
            String subTextOne = input1.getText();
            String subTextTwo = input2.getText();


        }
        else if(actionEvent.getSource() == multiply){
            String mulTextOne = input1.getText();
            String mulTextTwo = input2.getText();


        }
        else if(actionEvent.getSource() == divide){
            String divTextOne = input1.getText();
            String divTextTwo = input2.getText();


        }


    }
}
