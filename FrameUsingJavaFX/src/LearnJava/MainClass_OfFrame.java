package LearnJava;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLabel;


public class MainClass_OfFrame 
{

	public static void main(String[] args) 
	{
//		FrameClass myframeobject = new FrameClass();
		
//		ImageIcon imageobject = new ImageIcon(image01);
		
		JLabel labelobject = new JLabel();
		labelobject.setText("Hello I am Nitesh");

		// To add the image icon
//		labelobject.setIcon(imageobject);
		
		
		// Helps to align the text.
		labelobject.setHorizontalTextPosition(JLabel.CENTER);
		labelobject.setVerticalTextPosition(JLabel.BOTTOM);
		labelobject.setHorizontalAlignment(JLabel.CENTER);
	    labelobject.setVerticalAlignment(JLabel.CENTER);
		
		
		JFrame jframeobject = new JFrame();
		jframeobject.setSize(400,400);
		jframeobject.setVisible(true);
		jframeobject.getContentPane().setBackground(new Color(0,255,255));
		jframeobject.getContentPane().setBackground(Color.cyan);
		jframeobject.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		jframeobject.add(labelobject);
		
		
		
	
	}

}
