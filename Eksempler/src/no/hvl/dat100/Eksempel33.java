package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel33 {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi året du vil undersøke:");
		int år = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi nummeret på måneden du vil undersøke:");
		int mnd = parseInt(tallTxt);
		int antDager = 31;
		
		if (mnd==4 || mnd==6 || mnd==9 || mnd==11)
			antDager = 30;
		else {
			if (mnd==2) {
				if ((år%4 == 0 && år%100 != 0) || (år%400 == 0))
					antDager = 29;
				else
					antDager = 28;
			}
		}
		
		showMessageDialog(null, "Måned " + mnd + " i år " + år + " har " + antDager + " dager.");
	}
}