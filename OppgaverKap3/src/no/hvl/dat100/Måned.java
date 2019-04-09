package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Måned {
	public static void main(String[] args) {
		String melding = showInputDialog("Oppgi et månedsnummer:");
		int mndNr = parseInt(melding);
		String mnd;
		
		switch (mndNr) {
		case 12: mnd = "Desember"; break;
		case 11: mnd = "November"; break;
		case 10: mnd = "Oktober"; break;
		case 9: mnd = "September"; break;
		case 8: mnd = "August"; break;
		case 7: mnd = "Juli"; break;
		case 6: mnd = "Juni"; break;
		case 5: mnd = "Mai"; break;
		case 4: mnd = "April"; break;
		case 3: mnd = "Mars"; break;
		case 2: mnd = "Februar"; break;
		case 1: mnd = "Januar"; break;
		default: mnd = "Ugyldig måned";
		}
		showMessageDialog(null, mnd);
	}
}