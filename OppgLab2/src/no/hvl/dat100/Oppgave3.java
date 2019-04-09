package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave3 {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi et heltall");
		int tall = parseInt(tallTxt);
		int svar = 1;
		
		for(int i = 1; i <= tall; i++) {
			svar = svar * i;
		}
		
		String ut = tall + "! er lik " + svar;
		showMessageDialog(null, ut);
	}
}