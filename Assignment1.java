import java.awt.*;

public class Assignment1 {

	public static void main(String[] args) {
		// create the drawing panel
		DrawingPanel panel = new DrawingPanel(220, 150);
		// set the background color
		panel.setBackground(Color.YELLOW);
		Graphics g = panel.getGraphics();
		
		
		// draw the blue circles
		g.setColor(Color.BLUE);
		g.fillOval(50, 25, 40, 40);
		g.fillOval(130, 25, 40, 40);

		// draw the red rectangles
		g.setColor(Color.RED);
		g.fillRect(70, 45, 80, 80);
		
		//black horizontal line
		g.setColor(Color.BLACK);
    		//g.drawLine(x,x,x,x);
	}
}
