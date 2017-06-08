import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.io.*; //Provides for system input and output through data streams, serialization and the file system.
import javax.imageio.*; //The main package of the Java Image I/O API.
//All about input and output
import java.awt.image.*;
  
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
		y+=3;
	}
}





//Resources
//   Java.io
//   ->https://docs.oracle.com/javase/7/docs/api/java/io/package-summary.html
//   java.imageio
//   ->https://docs.oracle.com/javase/7/docs/api/javax/imageio/package-summary.html