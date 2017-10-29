import javax.swing.*;
import java.awt.*;

public class ArrowsPanel extends JPanel
{
	
	Color panelColor;
	String message; // instance variable

	public ArrowsPanel(Color c, String m)
	{
		panelColor = c;
		message = m;
		this.setBackground(c);
	}
	
	public void paintComponent(Graphics g)
	{
		super.paintComponent(g);
		int panelWidth = this.getWidth();
		int panelHeight = this.getHeight();
		
		
		g.setColor(Color.black);
		g.drawLine(100, 100, 400,100);
		g.drawLine(100, 100, 50, 50);
		g.drawLine(100, 100, 50, 150);
		g.drawLine(400, 100, 450, 50);
		g.drawLine(400, 100, 450, 150);
		
		g.drawLine(100, 400, 400,400);
		g.drawLine(100, 400, 150, 350);
		g.drawLine(100, 400, 150, 450);
		g.drawLine(400, 400, 350, 350);
		g.drawLine(400, 400, 350, 450);
	}

}