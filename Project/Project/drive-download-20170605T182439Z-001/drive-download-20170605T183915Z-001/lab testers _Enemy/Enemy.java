import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*; //for an ArrayList 
public class Enemy
{
	int x;
	int y; 
	
	Enemy(int x, int y) 
	{
		this.x = x; 
		this.y = y;
		
	}
	public void move()
	{
		x-=3;
	}
}