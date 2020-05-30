package _11_whack_a_mole;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WhackAMole implements ActionListener {
    int howManyTimes = 24;
    int randomNumber;
    JFrame frame = new JFrame();
    JPanel panel = new JPanel();

    public void createUI() {
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(400,500);
        Random randy = new Random();
        for (int i = 0; i <= 24; i++) {
            randomNumber = randy.nextInt(25);
            drawButton(randomNumber);
        }
    }

    void drawButton(int count){
        JButton randyButton = new JButton();
        panel.add(randyButton);
        randyButton.setSize(50,20);
        if(randomNumber == 14){
            randyButton.setText("MOLE!");
        }
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

    }
}
