import java.awt.Frame;
import java.awt.Button;

public class FrameTest
{

	Frame frame = new Frame("Test");
	Button button = new Button("Button");
	
	public void createFrame()
	{
		//frame components on frame
		frame.add(button);
		
		//set the size of frame
		frame.setSize(600, 600);
		
		//make a frame visible
		frame.setVisible(true);
	}
		
	public static void main(String[] args)
	{
		//open a frame
		FrameTest frame = new FrameTest();
		frame.createFrame();
	} 
}

/*
		f.setSize(400,400);
		f.setBackground(color.red);
		f.setVisible(true);
*/