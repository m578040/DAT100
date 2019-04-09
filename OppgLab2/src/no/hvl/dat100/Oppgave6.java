package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave6 {
	public static void main(String[] args) {
		String melding = "Oppgi poengsum: ";
		final int ANT_STUDENTER = 10;
		int nr = 1;
		String feilmelding = "Ugyldig inntasting. Prøv på nytt.";
		String ut = "";
		
		do {
			int poeng = parseInt(showInputDialog(melding));
			
			if ((poeng >= 0) && (poeng < 40)) {
				ut = "Poengsummen for student " + nr + " tilsvarer karakteren: F";
				nr++;
			} else if ((poeng >= 40) && (poeng < 50)) {
				ut = "Poengsummen for student " + nr + " tilsvarer karakteren: E";
				nr++;
			} else if ((poeng >= 50) && (poeng < 60)) {
				ut = "Poengsummen for student " + nr + " tilsvarer karakteren: D";
				nr++;
			} else if ((poeng >= 60) && (poeng < 80)) {
				ut = "Poengsummen for student " + nr + " tilsvarer karakteren: C";
				nr++;
			} else if ((poeng >= 80) && (poeng < 90)) {
				ut = "Poengsummen for student " + nr + " tilsvarer karakteren: B";
				nr++;
			} else if ((poeng >= 90) && (poeng <= 100)) {
				ut = "Poengsummen for student " + nr + " tilsvarer karakteren: A";
				nr++;
			} else {
				ut = feilmelding;
			}
			
			showMessageDialog(null, ut);
			
		} while (nr <= ANT_STUDENTER);
		
		
	}
}