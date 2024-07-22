package LearnJava;

import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JFrame;


/*
 * Myframe is a child class of JFrame.
 * 
 * JFrame is a superclass or sub class 
 */
public class FrameClass extends JFrame
{
	FrameClass()
	{
		//Creates a frame. A instence of frame
				
				
				// To change the tittle. Or sets the title
				this.setTitle("JFRAME TITLE");
				
				/*
				 * here the window does close if we press on close buttone so to close the window we have..
				 * 
				 * exit out of the application.
				 */
				this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
				
				
				/*
				 * By default we can resize our window so to change that we use.
				 * 
				 * prevent frame to resize.
				 */
				this.setResizable(false);
				
				
				
				
				// Sets the x- dimension and y- dimention of the frame.
				this.setSize(420,420);
				
				//This line of code makes the frame visible.
				this.setVisible(true);
				
				
				// We use image icon class to add the image by creating the object an adding the file path or name of the file.
				ImageIcon imageobject = new ImageIcon("LOGO.png");
				
				
				// This line of code will chnage the icone of the frame
				this.setIconImage(imageobject.getImage());
				
				
				// Changing the background color of the frame.
				
				this.getContentPane().setBackground(new Color(0,255,255));
				
						
	}

}
