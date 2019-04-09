package no.hvl.dat100;
import easygraphics.EasyGraphics;

public class Bondesjakk extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("Bondesjakk", 500, 500);
		
		setColor(0, 0, 0);
		drawRectangle(50, 50, 300, 300);
		drawLine(150, 50, 150, 350);
		drawLine(250, 50, 250, 350);
		drawLine(50, 150, 350, 150);
		drawLine(50, 250, 350, 250);
	}
}