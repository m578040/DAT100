package no.hvl.dat100;
import static java.lang.System.*;

public class Eksempel41 {
	public static void main(String[] args) {
		skrivTegn('+', 7);
	}
	
	private static void skrivTegn(char t, int antall) {
		for (int i = 1; i <= antall; i++) {
			out.print(t);
		}
		out.println();
	}
}