package _05_typing_tutor;

import javax.swing.*;
import java.util.Random;

public class TypingTutor {
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    char currentLetter;


    char generateRandomLetter() {
        Random r = new Random();
        return (char) (r.nextInt(26) + 'a');
    }



    public static void main(String[] args) {
        new TypingTutor();

    }

    public TypingTutor(){
        frame.setTitle("Typing Tutor");
        frame.setVisible(true);
        frame.setSize(500,500);
        frame.add(label);
        char currentLetter = generateRandomLetter();
        label.setText(Character.toString(currentLetter));
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.addKeyListener();
    }


}