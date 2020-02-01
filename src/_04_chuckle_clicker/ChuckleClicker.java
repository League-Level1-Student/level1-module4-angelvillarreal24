package _04_chuckle_clicker;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class  ChuckleClicker implements ActionListener {

    JFrame frame = new JFrame();
    JPanel panel = new JPanel();
    JButton jokebutton = new JButton();
    JButton punchbutton = new JButton();


    public static void main(String[] args) {
        ChuckleClicker click = new ChuckleClicker();
        click.makeButton();

    }

    public void makeButton(){

        frame.add(panel);
        panel.add(jokebutton);
        panel.add(punchbutton);
        jokebutton.setText("joke");
        punchbutton.setText("punchline");
        frame.setTitle("Chuckle Clicker");
        frame.pack();
        frame.show(true);

        jokebutton.addActionListener(this);
        punchbutton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==jokebutton){
            JOptionPane.showMessageDialog(null, "What is it called when a snowman has a temper tantrum?\n" +
                    "\n" +
                    "A meltdown!");
        }
        else if(e.getSource()==punchbutton){
            JOptionPane.showMessageDialog(null, "Did you know the original French fries weren’t fried in France?\n" +
                    "\n" +
                    "They were fried in Grease.");
        }
        else{
            System.out.println("What did you so to cause this. this isn't even supposed to be here.");
        }
    }
}
