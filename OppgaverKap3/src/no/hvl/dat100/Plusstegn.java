package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Plusstegn {
	public static void main(String[] args) {
		String melding = "Oppgi et heltall mellom 1 og 10";
		String feilmelding = "Ugyldig inntasting";
		boolean inntasting = false;
		int tall = 0;
		
		do {
			tall = parseInt(showInputDialog(melding));
			
			if ((tall < 1) || (tall > 10)) {
				showMessageDialog(null, feilmelding);
			} else {
				inntasting = true;
			}
		} while (inntasting == false);
		
		for (int i = 1; i <= tall; i++) {
			for (int o = 1; o <= tall; o++) {
				if (o <= i) {
					System.out.print("x ");
				}
			}
			System.out.println();
		}
		
		System.out.println();
		System.out.println();
		System.out.println();
		
		for (int i = 1; i <= tall; i++) {
			if (i < tall) {
				System.out.println("+");
			}
			
			for (int o = 1; o <= tall; o++) {
				if (i == tall) {
					System.out.print("+ ");
				}
			}
		}
	}
}