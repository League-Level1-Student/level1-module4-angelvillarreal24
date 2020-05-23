package _09_latest_tweet;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LatestTweet implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JTextField text = new JTextField(25);
    JButton button = new JButton();

    void createUI(){
        frame.add(panel);
        panel.add(text);
        panel.add(button);
        frame.setVisible(true);
        frame.setSize(500,100);
        button.setText("Search the Twitterverse");
        frame.setTitle("The Amazing Tweet Retriever");
        text.setSize(100,20);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {
        System.out.println("tweet tweet");
        JOptionPane.showMessageDialog(null, "asdnasd" );
    }
}
