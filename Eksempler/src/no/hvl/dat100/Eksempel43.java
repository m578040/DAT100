package no.hvl.dat100;
import static java.lang.System.*;

public class Eksempel43 {
	public static void main(String[] args) {
		int svar = sum(2, 6);
		out.println("Sum fra og med 2 til og med 6 = " + svar);
	}
	
	private static int sum(int fra, int til) {
		int summen = (fra + til) * (til - fra + 1) / 2;
		return summen;
	}
}