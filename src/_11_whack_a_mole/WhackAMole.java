package _11_whack_a_mole;

import javax.swing.*;
import java.applet.AudioClip;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;
import java.util.Random;

public class WhackAMole implements ActionListener {
    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private String mole = "MOLE!";
    private Random randy = new Random();
    private int count;
    private int misses;
    private Date timeAtStart;

    void createUI() {
        timeAtStart = new Date();
        frame.add(panel);
        frame.setVisible(true);
        frame.setSize(400, 500);
        panel.setLayout(new GridLayout(8, 3));
        int randomNumber = randy.nextInt(24);
        drawButtons(randomNumber);
    }

    private void drawButtons(int count) {

        for (int i = 0; i <= 23; i++) {
            JButton randyButton = new JButton();
            randyButton.setSize(50, 20);
            panel.add(randyButton);
            randyButton.addActionListener(this);
            if (count == i) {
                randyButton.setText(mole);
            }
        }


    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JButton buttonClicked = (JButton) actionEvent.getSource();
        if (buttonClicked.getText().equals(mole)) {
            panel.removeAll();
            speak("Got It!");
            int randomNumber = randy.nextInt(24);
            count++;
            playSound();
            drawButtons(randomNumber);


        } else if (buttonClicked.getText().isBlank()) {
            panel.removeAll();
            speak("bruh you missed");
            int randomNumber = randy.nextInt(24);
            misses++;
            drawButtons(randomNumber);
        }
        if (count >= 10) {
            endGame(timeAtStart, count);
        }
        if (misses >= 5) {
            JOptionPane.showMessageDialog(null, "You have missed 5, you have lost.");
        }
        frame.pack();
        frame.setSize(400, 500);
    }

    private void speak(String words) {
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

    private void playSound() {
        AudioClip sound = JApplet.newAudioClip(getClass().getResource("./whack.wav"));
        sound.play();
    }

}
