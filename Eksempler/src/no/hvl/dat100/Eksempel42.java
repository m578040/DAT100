package no.hvl.dat100;
import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Eksempel42 {
	public static void main(String[] args) {
		visLottotall();
		out.println();
		
		out.println("Lotto-tall: ");
		visSlumptall(1, 34);
		out.println();
		
		int etSiffer = trekkSlumptall(0, 9);
		showMessageDialog(null, "Siffer: " + etSiffer);
	}
	
	private static void visLottotall() {
		int tall = (int)(random()*34) + 1;
		out.println("Lotto-tall: " + tall);
	}
	
	private static void visSlumptall (int fra, int til) {
		int tall = (int)(random()*(til - fra + 1)) + fra;
		out.println(tall);
	}
	
	private static int trekkSlumptall(int fra, int til) {
		int tall = (int)(random()*(til - fra + 1)) + fra;
		return tall;
	}
}