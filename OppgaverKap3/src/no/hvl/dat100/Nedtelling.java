package no.hvl.dat100;
import easygraphics.*;

public class Nedtelling extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		for (int antSek=10; antSek>=0; antSek--) {
			makeWindow("Nedtelling", 400, 400);
			int x = 200;
			int y = 200;
			int tall;
			
			setFont("Arial", 50);
			tall = drawString(String.valueOf(antSek), x, y);
			pause(1000);
			setVisible(tall, false);
		}
	}
}