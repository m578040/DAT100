package no.hvl.dat100;
import easygraphics.*;

public class Eksempel315 extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}
	
	public void run() {
		makeWindow("SirkelSerie");
		
		int radius = 15;
		int y = 50;
		boolean medFyll = true;
		for (int i=1; i<=10; i++) {
			int x = 2*radius*1;
			if (medFyll)
				fillCircle (x, y, radius);
			else
				drawCircle (x, y, radius);
			medFyll = !medFyll;
			pause(500);
		}
	}
}