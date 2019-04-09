package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class CmOgTommer {
	public static void main(String[] args) {
		String melding = "Oppgi antall tommer:";
		double tommer = parseDouble(showInputDialog(melding));
		double cm = (tommerTilCm(tommer))/100;
		showMessageDialog(null, tommer + " tommer" + "\n" + cm + " centimeter");
		
		melding = "Oppgi antall centimeter:";
		cm = parseDouble(showInputDialog(melding));
		tommer = (cmTilTommer(cm))/100;
		showMessageDialog(null, cm + " centimeter" + "\n" + tommer + " tommer");
	}
	
	private static double cmTilTommer(double m) {
		return ((int)((m/2.54)*100)+0.5);
	}
	
	private static double tommerTilCm(double m) {
		return ((int)((m*2.54)*100)+0.5);
	}
}