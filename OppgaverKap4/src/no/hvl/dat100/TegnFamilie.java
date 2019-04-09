package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import easygraphics.*;

public class TegnFamilie extends EasyGraphics {
	public static void main(String[] args) {
		launch(args);
	}

	public void run() {
		String melding = "Oppgi antall barn:";
		int antall = parseInt(showInputDialog(melding));
		
		makeWindow("Familie", 800, 600);
		tegnForeldre(2, 20, 500, 125, 300, 10);
		tegnBarn(antall, 290, 500, 100, 150, 10);
	}
	
	private void tegnForeldre(int antall, int startX, int startY, int bredde, int høyde, int avstand) {
		for (int i=1; i<=antall; i++) {
			tegnVBein(startX, startY, bredde, høyde);
			tegnVKropp(startX, startY, bredde, høyde);
			tegnVHode(startX, startY, bredde, høyde);
			startX = startX + bredde + avstand;
		}
	}
	
	private void tegnBarn(int antall, int startX, int startY, int bredde, int høyde, int avstand) {
		for (int i=1; i<=antall; i++) {
			tegnBBein(startX, startY, bredde, høyde);
			tegnBKropp(startX, startY, bredde, høyde);
			tegnBHode(startX, startY, bredde, høyde);
			startX = startX + bredde + avstand;
		}
	}
	
	private void tegnVBein(int x, int y, int bredde, int høyde) {
		drawLine(x, y, x+bredde/2, y-høyde/2);
		drawLine(x+bredde, y, x+bredde/2, y-høyde/2);
	}
	
	private void tegnVKropp(int x, int y, int bredde, int høyde) {
		drawLine(x+bredde/2, y-høyde/2, x+bredde/2, ((y-høyde)/5)*4);
		drawLine(x, y-høyde, x+bredde, y-høyde);
	}
	
	private void tegnVHode(int x, int y, int bredde, int høyde) {
		drawCircle(x+bredde/2, ((y-høyde)/5)*3, 40);
	}
	
	private void tegnBBein(int x, int y, int bredde, int høyde) {
		drawLine(x, y, x+bredde/2, y-høyde/2);
		drawLine(x+bredde, y, x+bredde/2, y-høyde/2);
	}
	
	private void tegnBKropp(int x, int y, int bredde, int høyde) {
		drawLine(x+bredde/2, y-høyde/2, x+bredde/2, ((y-høyde)/5)*4);
		drawLine(x, y-høyde, x+bredde, y-høyde);
	}
	
	private void tegnBHode(int x, int y, int bredde, int høyde) {
		drawCircle(x+bredde/2, ((y-høyde)/7)*5, 32);
	}
}