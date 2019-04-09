package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;
import static java.lang.Double.*;
import easygraphics.*;

public class TegnLastebil extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		makeWindow("Lastebilrekke");
		tegnLastebilrekke(5, 20, 200, 60, 40, 10);
	}
	
	private void tegnLastebilrekke(int antall, int startX, int startY, int bredde, int høyde, int avstand) {
		for (int i=1; i<=antall; i++) {
			tegnLastebil(startX, startY, bredde, høyde);
			startX = startX + bredde + avstand;
		}
	}
	
	private void tegnLastebil(int x, int y, int bredde, int høyde) {
		int midten = y-høyde/2;
		drawRectangle(x, y, bredde, høyde/2);
		drawRectangle(x, midten, (bredde/3)*2, høyde/2);
		drawRectangle(x+(bredde/3)*2, y-høyde/3, bredde/6, høyde/3);
		drawCircle(x+(bredde/6), y+((høyde/6)*4), 5);
		drawCircle(x+((bredde/6)*2), y+((høyde/6)*4), 5);
		drawCircle(x+((bredde/6)*5), y+((høyde/6)*4), 5);
	}
}