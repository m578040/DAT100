package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel39{
	public static void main(String[] args) {
		String melding = "Høyde i cm, avslutt med 0:";
		String feilmelding = "Ugyldig høyde";
		double sum = 0;
		int antall = 0;
		int høyde = parseInt(showInputDialog(melding));
		while (høyde != 0) {
			if (!(høyde > 0) || !(høyde < 272)) {
				showMessageDialog(null, feilmelding);
				høyde = parseInt(showInputDialog(melding));
			} else {
				sum += høyde;
				antall++;
				høyde = parseInt(showInputDialog(melding));
			}
		}
		showMessageDialog(null, "Gjennomsnitt: " + sum/antall);
	}
}