import java.awt.*;
import javax.swing.*;
import java.lang.Math;

public class GeometricStar extends JFrame {

	// The number of vertices on 
	public static int sideLength = 800;
	public static int nVertices = 30;
	public static double vertDist = ((sideLength / 2.0) / (1.0 * (nVertices + 1)));
	
	public GeometricStar() {
		super();
	}
	
	public void paint(Graphics g) {
		int center = sideLength / 2;
		
		// draw square background
		Color bgColor = Color.WHITE;
		g.setColor(bgColor);
		g.fillRect(0, 0, sideLength, sideLength);
		
		// draw x and y axis
		Color xyAxisColor = Color.BLACK;
		g.setColor(xyAxisColor);
		g.drawLine(0, center, sideLength, center);
		g.drawLine(center, 0, center, sideLength);
		
		for (int i = 1; i <= nVertices; i++) {
			int intDist = (int) (i * vertDist);
			g.drawLine(intDist, center, center, center - intDist);
			g.drawLine(sideLength - intDist, center, center, center - intDist);
			g.drawLine(intDist, center, center, center + intDist);
			g.drawLine(sideLength - intDist, center, center, center + intDist);
		}
	}
	
	public static void main(String arg[]){
		GeometricStar window = new GeometricStar();
		window.setSize(sideLength, sideLength);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
