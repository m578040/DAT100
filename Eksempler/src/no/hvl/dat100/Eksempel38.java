package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel38 {
	public static void main(String[] args) {
		String melding = "Oppgi nedbør i mm for dag ";
		final int ANT_DAGER = 7;
		int sum = 0;
		int nedbør;
		
		for (int i = 1; i <= ANT_DAGER; i++) {
			nedbør = parseInt(showInputDialog(melding + i + ":"));
			sum += nedbør;
		}
		showMessageDialog(null, "Samlet nedbør: " + sum);
	}
}