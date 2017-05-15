import java.awt.*;
import javax.swing.*;

public class realFrame
{
	public static void main(String args[])
	{
		Dimension dim = new Dimension(1000,1000);
		
		JFrame frame = new JFrame("Shooting");
		JLabel label = new JLabel("Shooting game");
		
		label.setText("Welcome!");
		
		//Whether to put colors or not.
		label.setOpaque(true);
		
		// (1)Bold, (2)Italic, (3)Plain
		Font font = new Font("Bradley Hand ITC",Font.BOLD,200);
		label.setFont(font);
		
		//methods for arrangement
		label.setVerticalAlignment(SwingConstants.TOP);
		label.setHorizontalAlignment(SwingConstants.LEFT);
		
		frame.add(label);
		
		//set the size of JFrame.
		frame.setPreferredSize(dim);
		
		frame.pack();
		frame.setVisible(true);
		
		//set the location where the frame should be
		frame.setLocation(0,0);

		
	}
		
}

	//label.setForeground(Color.GREEN); //color of words
	//label.setBackground(Color.RED); //color of background.



/*
class frame extends JFrame
{
	int fWidth = 800;
	int fHeight = 600;
	
	frame();
	//init();
	//start();
}

// void java.awt.Window.setDefaultCloseOperation(int operation);
// -> Options when you choose to close a frame.
*/