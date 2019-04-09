package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel310 {
	public static void main(String[] args) {
		String melding = "Resultatet av terningkast:";
		int sum = 0;
		int antall = 0;
		do {
			int verdi = parseInt(showInputDialog(melding));
			sum += verdi;
			antall++;
		} while (sum < 100);
		showMessageDialog(null, "Antall kast: " + antall);
	}
}