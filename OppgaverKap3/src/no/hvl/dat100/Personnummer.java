package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Personnummer {
	public static void main(String[] args) {
		String pNrTxt = showInputDialog("Oppgi et personnummer:");
		int pNr = parseInt(pNrTxt);
		int kjønn = (pNr%1000)/100;
		String mannUtTxt = "Dette personnummeret tilhører en mann";
		String dameUtTxt = "Dette personnummeret tilhører en dame";
		
		if (kjønn == 1 || kjønn == 3 || kjønn == 5 || kjønn == 7 || kjønn == 9)
			showMessageDialog(null, mannUtTxt);
		else
			showMessageDialog(null, dameUtTxt);
	}
}