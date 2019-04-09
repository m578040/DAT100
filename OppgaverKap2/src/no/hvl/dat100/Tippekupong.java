package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.Integer.*;
import static java.lang.Math.*;

public class Tippekupong {
	public static void main(String[] args) {
		String tallTxt = showInputDialog("Oppgi ønsket antall kamper");
		int antKamper = parseInt(tallTxt);
		double antMulRekker = pow(3, antKamper);
		String utTxt = "Antall mulige rekker på din tippekupong blir " + antMulRekker;
		showMessageDialog(null, utTxt);
	}
}