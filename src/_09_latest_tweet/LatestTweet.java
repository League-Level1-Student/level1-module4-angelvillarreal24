package _09_latest_tweet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatestTweet implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField text = new JTextField();
    JButton button = new JButton();

    void createUI(){
        frame.add(panel);
        panel.add(text);
        panel.add(button);
        frame.setVisible(true);
        frame.setSize(500,500);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("tweet tweet");
    }
}
