package _12_slot_machine;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

public class SlotMachine implements ActionListener {
    private Random random1 = new Random();
    private Random random2 = new Random();
    private Random random3 = new Random();

    private JFrame frame = new JFrame();
    private JPanel panel = new JPanel();
    private JLabel slot1 = new JLabel();
    private JLabel slot2 = new JLabel();
    private JLabel slot3 = new JLabel();
    private JButton play = new JButton();
    private int coins = 50;
    private JLabel coinsCounter = new JLabel();
    private JLabel winCounter = new JLabel();
    private JButton giveCoins = new JButton();
    private int wins;

    void createUI() {
        frame.add(panel);
        panel.add(slot1);
        panel.add(slot2);
        panel.add(slot3);
        panel.add(play);
        panel.add(coinsCounter);
        panel.add(winCounter);
        panel.add(giveCoins);

        play.setText("Play!");
        play.addActionListener(this);
        giveCoins.setText("Give 50 Coins");
        giveCoins.addActionListener(this);
        coinsCounter.setText("coins: " + coins);
        winCounter.setText("Wins :" + wins);
        frame.setTitle("Slot Machine");
        frame.pack();
        frame.setVisible(true);
    }

    private JLabel createLabelImage(String fileName) throws MalformedURLException {
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null) {
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
        Icon icon = new ImageIcon(imageURL);
        JLabel imageLabel = new JLabel(icon);
        return imageLabel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getSource().equals(giveCoins)) {
            coins += 50;
            JOptionPane.showMessageDialog(null, "Nice, you now have 50 more coins! Your total amount of coins are: " + coins);
            coinsCounter.setText("coins: " + coins);
            frame.pack();
        } else {
            if (coins <= 0) {
                JOptionPane.showMessageDialog(null, "You can't play again, you don't have enough coins!");
            } else {
                coins -= 5;
                coinsCounter.setText("coins: " + coins);
                panel.remove(slot1);
                panel.remove(slot2);
                panel.remove(slot3);
                int randy1 = random1.nextInt(3);
                if (randy1 == 0) {
                    try {
                        slot1 = createLabelImage("cherry.png");
                        panel.add(slot1);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                } else if (randy1 == 1) {
                    try {
                        slot1 = createLabelImage("lime.jpg");
                        panel.add(slot1);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        slot1 = createLabelImage("orange.jpg");
                        panel.add(slot1);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }


                int randy2 = random2.nextInt(3);
                if (randy2 == 0) {
                    try {
                        slot2 = createLabelImage("cherry.png");
                        panel.add(slot2);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                } else if (randy2 == 1) {
                    try {
                        slot2 = createLabelImage("lime.jpg");
                        panel.add(slot2);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        slot2 = createLabelImage("orange.jpg");
                        panel.add(slot2);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }


                int randy3 = random3.nextInt(3);
                if (randy3 == 0) {
                    try {
                        slot3 = createLabelImage("cherry.png");
                        panel.add(slot3);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                } else if (randy3 == 1) {
                    try {
                        slot3 = createLabelImage("lime.jpg");
                        panel.add(slot3);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                } else {
                    try {
                        slot3 = createLabelImage("orange.jpg");
                        panel.add(slot3);
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }

                if (randy1 == 0 && randy2 == 0 && randy3 == 0) {
                    coins += 100;
                    frame.pack();
                    JOptionPane.showMessageDialog(null, "Congratulations! you got 3 cherries in a row! You have gained 100 coins! Your total amount of coins now is " + coins);
                    coinsCounter.setText("coins: " + coins);
                    wins++;
                    winCounter.setText("Wins :" + wins);
                }
                if (randy1 == 1 && randy2 == 1 && randy3 == 1) {
                    coins += 50;
                    frame.pack();
                    JOptionPane.showMessageDialog(null, "Congratulations! you got 3 limes in a row! You have gained 50 coins! Your total amount of coins now is " + coins);
                    coinsCounter.setText("coins: " + coins);
                    wins++;
                    winCounter.setText("Wins :" + wins);
                }
                if (randy1 == 2 && randy2 == 2 && randy3 == 2) {
                    coins += 20;
                    frame.pack();
                    JOptionPane.showMessageDialog(null, "Congratulations! you got 3 oranges in a row! You have gained 20 coins! Your total amount of coins now is " + coins);
                    coinsCounter.setText("coins: " + coins);
                    wins++;
                    winCounter.setText("Wins :" + wins);
                }

            }
            panel.revalidate();
            frame.revalidate();
            frame.pack();
            frame.repaint();

        }
    }
}
