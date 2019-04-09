package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class SumTallserie {
	public static void main(String[] args) {
		int sum = summer();
		showMessageDialog(null, "Summen av tallserien er " + sum);
	}

	private static int summer() {
		int start;
		int slutt;
		boolean m = false;

		do {
			start = parseInt(showInputDialog("Oppgi starten på tallserien:"));
			slutt = parseInt(showInputDialog("Oppgi slutten på tallserien:"));

			if ((start < 0 || slutt < 0) || slutt < start) {
				showMessageDialog(null, "Feil i inntastingen");
			} else {
				m = true;
			}
		} while (m == false);

		int sum = 0;
		for (int i = start; i <= slutt; i++) {
			sum = sum + i;
		}
		return sum;
	}
}