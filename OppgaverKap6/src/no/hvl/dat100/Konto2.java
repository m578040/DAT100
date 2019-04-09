package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;

public class Konto2 {
	static int nesteLedige = 1;
	
	int kontoNr;
	int saldo;
	
	public Konto2(int saldo) {
		kontoNr = nesteLedige++;
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}
	
	public int getKontonr() {
		return kontoNr;
	}

	public void setKontonr(int kontonr) {
		this.kontoNr = kontonr;
	}
	
	public static void main(String[] args) {
		final int ANT_KONTO = 10;
		
		Konto2[] kontoer = new Konto2[10];
		
		for (int i = 0; i < 10; i++) {
			kontoer[i] = new Konto2(0);
		}
		
		int nr = 0;
		String feilmelding = "Ugyldig kontonummer. Prøv på nytt.";
		
		do {
			for (int i = 0; i < ANT_KONTO; i++) {
				String tallTxt = showInputDialog("Oppgi kontonummer:");
				nr = parseInt(tallTxt);
				if (nr > 10) {
					showMessageDialog(null, feilmelding);
				} else if (nr == i+1) {
					tallTxt = showInputDialog("Oppgi beløp, positivt for innskudd og negativt for uttak:");
					kontoer[i].setSaldo(parseInt(tallTxt));
					String ut = "Kontoinformasjon" + "\n"
					           + "Konto nr.: " + kontoer[i].getKontonr() + "\n"
					           + "Saldo kr.: " + kontoer[i].getSaldo() + "\n";
					showMessageDialog(null, ut);
				}
			}
		} while (nr != 0);
	}
}
