package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.Double.*;

public class Eksempel5Ekstra {
	public static void main(String[] args) {
		double[] tall = {-2.3, 1.4, 3.1, 3.69, 5.0, 7.75};
		
		String tallTxt = showInputDialog("Gi desimaltall:");
		double leterEtter = parseDouble(tallTxt);
		
		boolean funnet = false;
		int i = 0;
		while (!funnet && i<tall.length && tall[i]<=leterEtter) {
			if (tall[i] == leterEtter) {
				funnet = true;
			} else {
				i++;
			}
			if (funnet) {
				showMessageDialog(null, "Funnet!");
			}
		}
	}
}