package no.hvl.dat100;
import static javax.swing.JOptionPane.*;

public class TestTegn {
	public static void main(String[] args) {
		String melding = "Oppgi et tegn:";
		char t = (showInputDialog(melding).charAt(0));
		showMessageDialog(null, lesTegn(t));
	}
	
	private static String lesTegn(char m) {
		String ut = "Tegnet " + m + " er";
		if (m >= 'a' && m <= 'z' || m >= 'A' && m <= 'Z') {
			ut += " en";
			if (m >= 'A' && m <= 'Z') {
				ut += " stor";
				m = (char)(m + 32);
			} else {
				ut += " liten";
			} 
			if (m == 'a' || m == 'e' || m == 'i' || m == 'o' || m == 'u' || m == 'y') {
				ut += " vokal.";
			} else {
				ut += " konsonant.";
			}
		} else if (m == 'æ' || m == 'ø' || m == 'å' || m == 'Æ' || m == 'Ø' || m == 'Å') {
			ut += " en";
			if (m == 'æ' || m == 'ø' || m == 'å') {
				ut += " liten vokal.";
			} else {
				ut += " stor vokal.";
			}
		} else {
			ut += " ikke en bokstav.";
		}
		return ut;
	}
}