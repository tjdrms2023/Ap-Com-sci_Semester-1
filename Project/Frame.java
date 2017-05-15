class Frame extends JFrame
{
	Frame();
	init();
	start();
	setTitle("Name of Frame");
	setSize(800,600);
	
	//Adjust the size of frame as the size of user's screen
	Dimension screeen = Toolkit.getDefaultToolkit().getScreenSize();
	
	//To set the frame on the middle of the screen
	int fXPos = (int)(scrren.getWidth() / 2 - 800 / 2);
	int fYPos = (int)(scrren.getHeight() / 2 - 600 / 2);
	setLocation(fXPos.fYPos);
	
	//make users not change the size
	setResizeable(false);
	setVisible(true);
}

public void init();
public void start();