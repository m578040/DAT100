package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Eksempel54 {
	public static void main(String[] args) {
		final int ANT_AVD = 4;
		int[] salgstall = new int[ANT_AVD];
		lesInn(salgstall);
		
		int sumSalg = beregnSum(salgstall);
		int snittSalg = sumSalg/ANT_AVD;
		String underSnitt = svakeAvd(salgstall, snittSalg);
		
		showMessageDialog(null,
				  "Samlet salg: " + sumSalg + "\n"
				+ "Snittsalg pr avd: " + snittSalg + "\n"
				+ "Avdelinger under snittet: " + underSnitt);
	}
	
	public static void lesInn(int[] tab) {
		for (int avdNr = 0; avdNr < tab.length; avdNr++) {
			String tallTxt = showInputDialog("Salgstall for avd.nr. " + avdNr + ": ");
			tab[avdNr] = parseInt(tallTxt);
		}
	}
	
	public static int beregnSum(int[] tab) {
		int sumSalg = 0;
		for (int salg:tab) {
			sumSalg += salg;
		}
		return sumSalg;
	}
	
	public static String svakeAvd(int[] tab, int snitt) {
		String underSnittet = "";
		for (int avdNr = 0; avdNr < tab.length; avdNr++) {
			if (tab[avdNr] < snitt) {
				underSnittet += avdNr + "  ";
			}
		}
		return underSnittet;
	}
}