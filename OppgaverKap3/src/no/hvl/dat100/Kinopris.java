package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Kinopris {
	public static void main(String[] args) {
		String prisTxt = "Fullpris:";
		String alderTxt = "Alder:";
		boolean pris = false;
		boolean alder = false;
		double prisen;
		int alderen;
		String feilmelding = "Ugyldig inntasting. Prøv på nytt";
		
		do {
			prisen = parseDouble(showInputDialog(prisTxt));
			
			if (prisen < 0) {
				showMessageDialog(null, feilmelding);
			} else {
				pris = true;
			}
		} while (pris == false);
		
		do {
			alderen = parseInt(showInputDialog(alderTxt));
			
			if ((alderen < 0) || (alderen > 117)) {
				showMessageDialog(null, feilmelding);
			} else {
				alder = true;
			}
		} while (alder == false);
		
		if ( alderen <= 5 )
			prisen = 0.0;
		else if (alderen < 12 || alderen >= 60)
			prisen /= 2;
		showMessageDialog(null, "Pris: " + prisen);
	}
}