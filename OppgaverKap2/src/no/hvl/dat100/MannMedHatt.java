package no.hvl.dat100;
import easygraphics.EasyGraphics;

public class MannMedHatt extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("HattHode", 270, 240);
		
		setColor(255, 255, 0);
		fillCircle(100, 148, 70);
		
		setColor(0, 0, 0);
		fillCircle(75, 150, 8);
		fillCircle(125, 150, 8);
		drawLine(80, 180, 120, 180);
		fillRectangle(20, 100, 160, 25);
		fillRectangle(50, 25, 100, 75);
	}
}