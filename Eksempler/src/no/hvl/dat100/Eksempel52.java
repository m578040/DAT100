package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel52 {
	public static void main(String[] args) {
		int[] antall = new int[6];
		int kast = lesHeltall();
		while (kast != 0) {
			antall[kast-1]++;
			kast = lesHeltall();
		}
		
		String utskrift = "";
		for (int i = 0; i < antall.length; i++) {
			utskrift += "Antall " + (i+1) + ": " + antall[i] + "\n";
		}
		showMessageDialog(null, utskrift);
	}
	
	private static int lesHeltall() {
		String melding = "Oppgi antall øyne på terningkastet:";
		int resultat = parseInt(showInputDialog(melding));
			if (resultat < 0 || resultat > 6) {
				showMessageDialog(null, "Ugyldig inntasting, prøv på nytt.");
			}
		return resultat;
	}
}