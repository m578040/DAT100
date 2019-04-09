package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Sum {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi et tall");
		int tall1 = parseInt(tallTxt);
		tallTxt = showInputDialog("Oppgi enda et tall");
		int tall2 = parseInt(tallTxt);
		int sum = tall1 + tall2;
		String utTxt = "Summen av tallene blir " + sum;
		showMessageDialog(null, utTxt);
	}
}