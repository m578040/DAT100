package no.hvl.dat100;
import static java.lang.Double.*;
import static javax.swing.JOptionPane.*;

public class Eksempel24 {

	public static void main(String[] args) {
		String tallTxt = showInputDialog("Gi et beløp:");
		double beløp = parseDouble(tallTxt);
		
		double moms = beløp*0.25;
		beløp = (int)(beløp*100+0.5)/100.0;
		moms = (int)(moms*100+0.5)/100.0;
		
		String ut = "Beløp: " + beløp + " kr" + "\n" + "Moms: " + moms + " kr" + "\n" + "Pris: " + (beløp+moms) + " kr";
		showMessageDialog(null, ut);
	}
}