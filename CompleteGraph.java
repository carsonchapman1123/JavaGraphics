import java.awt.*;

import javax.swing.*;

import java.lang.Math;

public class CompleteGraph extends JFrame {
	
	static int sideLength = 800;
	static int vertices = 23;
	static int radius = 370;
	
	// Constructor for JFrame Object
	public CompleteGraph(){
		super();
	}
	
	public void paint(Graphics g){
		int center = sideLength / 2;
		double angleSize = 2 * 3.1415926 / (1.0 * vertices);
		
		// create list of vertex coordinates
		int[][] coords = new int[vertices][2];
		for (int i = 0; i < vertices; i++){
			coords[i][0] = (int) (center + radius * Math.cos(i * angleSize));
			coords[i][1] = (int) (center + radius * Math.sin(i * angleSize));
		}
		
		// draw square background
		Color bgColor = Color.BLACK;
		g.setColor(bgColor);
		g.fillRect(0, 0, sideLength, sideLength);
		
		// Draw complete graph
		Color graphColor = Color.WHITE;
		g.setColor(graphColor);
		for (int i = 0; i < vertices - 1; i++){
			for (int j = i + 1; j < vertices; j++){
				g.drawLine(coords[i][0], coords[i][1], coords[j][0], coords[j][1]);
			}
		}
		
	}
	
	public static void main(String arg[]){
		CompleteGraph window = new CompleteGraph();
		window.setSize(sideLength, sideLength);
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
