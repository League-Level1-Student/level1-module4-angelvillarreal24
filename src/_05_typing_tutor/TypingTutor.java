package _05_typing_tutor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class TypingTutor implements KeyListener {
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
        currentLetter = generateRandomLetter();
        label.setText(Character.toString(currentLetter));
        label.setFont(label.getFont().deriveFont(28.0f));
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.addKeyListener(this);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    public void keyPressed(KeyEvent e) {
        char fjyf = e.getKeyChar();
        System.out.println(currentLetter);
        if (fjyf == currentLetter) {
            System.out.println("yes");
            frame.setBackground(Color.green);
            updateLetter();
        } else {
            System.out.println("no");
            frame.setBackground(Color.red);
        }
    }
        public void keyReleased(KeyEvent e){

        }
        public void updateLetter(){
            currentLetter = generateRandomLetter();
            label.setText(Character.toString(currentLetter));
        }

    }
