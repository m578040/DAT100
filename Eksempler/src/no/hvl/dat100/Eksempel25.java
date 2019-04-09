package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel25 {
	public static void main(String[] args) {
		String melding = "Kodenummer: ";
		String kodeTxt = showInputDialog(melding);
		int kodeNr = parseInt(kodeTxt);
		char tegn = (char) kodeNr;
		melding = melding + kodeNr + " = " + tegn;
		showMessageDialog(null, melding);
	}
}