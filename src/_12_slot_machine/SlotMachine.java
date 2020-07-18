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
    void createUI(){
        frame.add(panel);
        panel.add(slot1);
        panel.add(slot2);
        panel.add(slot3);
        panel.add(play);

        play.setText("Play!");
        play.addActionListener(this);
        frame.pack();
        frame.setVisible(true);
    }

    private JLabel createLabelImage(String fileName) throws MalformedURLException {
        URL imageURL = getClass().getResource(fileName);
        if (imageURL == null){
            System.err.println("Could not find image " + fileName);
            return new JLabel();
        }
        Icon icon = new ImageIcon(imageURL);
        JLabel imageLabel = new JLabel(icon);
        return imageLabel;
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "bruh");
        int randy1 = random1.nextInt(3);
        if(randy1==0){
            //createLabelImage("cherry.png");
            //currently does not work
        }else if(randy1==1){

        }else{

        }
        int randy2 = random2.nextInt(3);
        if(randy2==0){

        }else if(randy2==1){

        }else{

        }
        int randy3 = random3.nextInt(3);
        if(randy3==0){

        }else if(randy3==1){

        }else{

        }
    }
}
