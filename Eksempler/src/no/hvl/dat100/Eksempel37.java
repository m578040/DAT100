package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel37 {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi tallet i nevneren");
		int nevner = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi tallet i telleren");
		int teller = parseInt(tallTxt);
		int sum = nevner;
		int antall = 0;
		while (sum <= teller) {
			sum = sum + nevner;
			antall++;
		}
		showMessageDialog(null, "Resultat = " + antall);
	}
}