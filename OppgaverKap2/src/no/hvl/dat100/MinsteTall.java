package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class MinsteTall {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi det første tallet");
		int tall1 = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi det andre tallet");
		int tall2 = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi det tredje tallet");
		int tall3 = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi det siste tallet");
		int tall4 = parseInt(tallTxt);
		int minsteTall = Math.min(Math.min(tall1, tall2), Math.min(tall3, tall4));
		String utTxt = "Det minste tallet av tallene du skrev inn er " + minsteTall;
		showMessageDialog(null, utTxt);
	}
}