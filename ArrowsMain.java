import javax.swing.*;
import java.awt.*;

public class ArrowsMain
{

	public static void main(String[] args)
	{
	
		JFrame theGUI = new JFrame();
		theGUI.setSize(500, 500);
		theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ArrowsPanel panel1 = new ArrowsPanel(Color.white, "Hello");
		
		Container pane = theGUI.getContentPane();
		
		pane.add(panel1);
		
		theGUI.setVisible(true);
		}
		
}