import java.awt.*;

public class Assignment1 {

	public static void main(String[] args) {
  
		//Create yellow DrawingPanel
		DrawingPanel panel = new DrawingPanel(220, 150);
		panel.setBackground(Color.YELLOW);
		Graphics drawShapes = panel.getGraphics();
		
		//2 blue ovals
		drawShapes.setColor(Color.BLUE);
		drawShapes.fillOval(50, 25, 40, 40);
		drawShapes.fillOval(130, 25, 40, 40);
		
		//red square
		drawShapes.setColor(Color.RED);
		drawShapes.fillRect(70, 45, 80, 80);
		
		//black horizontal line
		drawShapes.setColor(Color.BLACK);
    //drawShapes.drawLine(x,x,x,x);
	}
}
