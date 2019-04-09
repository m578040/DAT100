package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Double.*;

public class Eksempel314 {
	public static void main(String[] args) {
		String prisTxt = showInputDialog("FullPris:");
		double pris = parseDouble(prisTxt);
		String alderTxt = showInputDialog("Alder:");
		int alder = parseInt(alderTxt);
		if ( alder <= 5 )
			pris = 0.0;
		else if (alder < 12 || alder >= 60)
			pris /= 2;
		showMessageDialog(null, "Pris: " + pris);
	}
}