package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Oppgave2 {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi bruttoinntekt");
		int inntekt = parseInt(tallTxt);
		double skatt = 0.0;
		double sats = 0.0;
		
		if (inntekt < 0) {
			showMessageDialog(null, "Ugyldig bruttoinntekt.");
		} else if ((inntekt > 0) && (inntekt <= 164100)) {
			skatt = 0.0;
		} else if ((inntekt > 164100) && (inntekt <= 230950)) {
			sats = 0.93;
			skatt = (inntekt/100)*sats;
		} else if ((inntekt > 230950) && (inntekt <= 580650)) {
			sats = 2.41;
			skatt = (inntekt/100)*sats;
		} else if ((inntekt > 580650) && (inntekt <= 934050)) {
			sats = 11.52;
			skatt = (inntekt/100)*sats;
			
		} else {
			sats = 14.52;
			skatt = (inntekt/100)*sats;
		}
		
		skatt = (int)(skatt*100+0.5)/100;
		String ut = "Bruttoinntekt: " + inntekt + "\n" + "Sats: " + sats + "\n" + "Trinnskatt: " + skatt;
		showMessageDialog(null, ut);
	}
}