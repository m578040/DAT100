package no.hvl.dat100;

import static java.lang.Integer.*;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;
import java.util.Arrays;

public class Grensesnitt {

	// Tom konstruktør
	public Grensesnitt() {
	}
	
	public Vare lesVare() {
		String tallTxt = showInputDialog("Oppgi varenr: ");
		int nr = parseInt(tallTxt);
		String navn = showInputDialog("oppgi navn: ");
		double pris = parseDouble(showInputDialog("oppgi pris: "));
		Vare v = new Vare(nr, navn, pris);

		return v;
	}
	
	public void visVare(Vare v) {
		System.out.println(v.toString());
	}
	
	public void visAlle(Varelager varelager) {
		for (int i = 0; i < varelager.getAntall(); i++) {
			System.out.println(varelager.getVarelager()[i].toString());
		}
	}
	
	public void visAlleSortert(Varelager varelager) {
		int størrelse = varelager.getAntall();
		String[] sortert = new String[størrelse];
		for (int i = 0; i < sortert.length; i++) {
			sortert[i] = varelager.getVarelager()[i].vareAlt();
		}

		Arrays.sort(sortert); // Kall til metode i klassen Arrays

		// Sortert utskrift etter studentnr
		for (int i = 0; i < sortert.length; i++) {
			System.out.println(sortert[i]);
		}
	}
}