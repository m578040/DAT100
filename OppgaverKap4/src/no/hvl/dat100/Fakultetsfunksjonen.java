package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Fakultetsfunksjonen {
	public static void main(String[] args) {
		String melding = "Oppgi et heltall:";
		int tall = parseInt(showInputDialog(melding));
		int svar = fakultet(tall);
		showMessageDialog(null, tall + "! er lik " + svar);
	}
	
	private static int fakultet(int m) {
		int n = 1;
		for(int i = 1; i <= m; i++) {
			n = n * i;
		}
		return n;
	}
}