package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel313 {
	public static void main(String[] args) {
		int laveste = 0, høyeste = 1000;
		String melding = "Tenk på et tall i omårdet " + laveste + " -- " + høyeste + ".";
		showMessageDialog(null, melding);
		int tall = (laveste + høyeste) / 2;
		boolean riktigGjettet = false;
		while ( !riktigGjettet ) {
			melding = "Tenkte du på " + tall + "? Skriv 0 for ja, -1 hvis for høyt, 1 hvis for lavt:";
			int svar = parseInt(showInputDialog(melding));
			
			if (svar == 0 )
				riktigGjettet = true;
			else if (svar == -1 )
				høyeste = tall - 1;
			else
				laveste = tall + 1;
			
			if ( laveste == høyeste )
				riktigGjettet = true;
			else
				tall = (laveste + høyeste) / 2;
		}
		melding = "Du tenkte på " + tall + "!";
		showMessageDialog(null, melding);
	}
}