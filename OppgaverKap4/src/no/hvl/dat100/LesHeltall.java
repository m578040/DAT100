package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class LesHeltall {
	public static void main(String[] args) {
		int heltall = lesHeltall(2, 10);
		showMessageDialog(null, "Heltall: " + heltall);
	}

	private static int lesHeltall(int nedre, int øvre) {
		int tall;
		boolean m = false;
		do {
			String tallTxt = showInputDialog("Oppgi et heltall:");
			tall = parseInt(tallTxt);

			if (tall < nedre || tall > øvre) {
				showMessageDialog(null, "Ugyldig inntasting");
			} else {
				m = true;
			}
		} while (m == false);
		return tall;
	}
}