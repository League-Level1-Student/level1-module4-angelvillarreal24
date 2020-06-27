package _11_whack_a_mole;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class WhackAMole implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    String mole = "MOLE!";
    Random randy = new Random();
    JButton randyButton;
    int count;
    int missCount;

    void createUI() {
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(400,500);
        panel.setLayout(new GridLayout(8, 3));
        int randomNumber = randy.nextInt(24);
        drawButtons(randomNumber);
    }

    private void drawButtons(int count){

        for (int i = 0; i <= 23; i++) {
            randyButton = new JButton();
            randyButton.setSize(50,20);
            panel.add(randyButton);
            randyButton.addActionListener(this);
            if(count == i){
                randyButton.setText(mole);
            }
        }



    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton buttonClicked = (JButton) actionEvent.getSource();
        if(buttonClicked.getText().equals(mole)){
            panel.removeAll();
            System.out.println("Got It!");
            int randomNumber = randy.nextInt(24);
            drawButtons(randomNumber);

        }
        else if(buttonClicked.getText().isBlank()){
            panel.removeAll();
            speak("bruh you missed");
            int randomNumber = randy.nextInt(24);
            drawButtons(randomNumber);
        }
        frame.pack();
        frame.setSize(400,500);
    }

    void speak(String words) {
        try {
            System.out.println(words);
            //Runtime.getRuntime().exec("say " + words).waitFor();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void endGame(Date timeAtStart, int molesWhacked) {
        Date timeAtEnd = new Date();
        JOptionPane.showMessageDialog(null, "Your whack rate is "
                + ((timeAtEnd.getTime() - timeAtStart.getTime()) / 1000.00 / molesWhacked)
                + " moles per second.");
    }
}
