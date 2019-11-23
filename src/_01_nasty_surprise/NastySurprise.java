package _01_nasty_surprise;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.ButtonGroup;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class NastySurprise implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton button1 = new JButton();
	JButton button2 = new JButton();

	public NastySurprise() {

	}

	public void createUI() {

		panel.add(button1);
		panel.add(button2);
		frame.add(panel);

		button1.setText("Trick");
		button2.setText("Treat");

		button1.addActionListener(this);
		button2.addActionListener(this);

		frame.show();
		frame.pack();
	}

	public static void main(String[] args) {
		NastySurprise system32 = new NastySurprise();
		system32.createUI();
	}
	
	private void showPictureFromTheInternet(String imageUrl) {
	     try {
	          URL url = new URL(imageUrl);
	          Icon icon = new ImageIcon(url);
	          JLabel imageLabel = new JLabel(icon);
	          JFrame frame = new JFrame();
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (MalformedURLException e) {
	          e.printStackTrace();
	     }
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("bruh");
		JButton clickedButton = (JButton) e.getSource();
		if (clickedButton == button1) {
			showPictureFromTheInternet("https://www.thelabradorsite.com/wp-content/uploads/2019/03/Cute-puppy-Names-Over-200-Adorable-Ideas-LS-long.jpg");
		}
		else if (clickedButton == button2) {
			showPictureFromTheInternet("https://www.androidpolice.com/wp-content/uploads/2015/07/nexus2cee_image14.png");
		}
	}

}

//scary picture https://www.androidpolice.com/wp-content/uploads/2015/07/nexus2cee_image14.png

//cute puppy picture https://www.thelabradorsite.com/wp-content/uploads/2019/03/Cute-puppy-Names-Over-200-Adorable-Ideas-LS-long.jpg