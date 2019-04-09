package no.hvl.dat100;

import static java.lang.System.*;

public class Oppgave1 {
	public static void main(String[] args) {
		out.println("Del 1");
		int i = 1;
		while (i < 1) {
			out.println("Nr 1, i = " + i);
		}
		
		out.println("Del 2");
		for (int j = 1; j < 8; j = j * 2) {
			out.println("Nr 2, j = " + j);
		}
		
		out.println("Del 3");
		String s = "Test";
		for (int k = s.length() - 1; k > 0; k = k - 1) {
			out.println("Nr 2, k = " + s.charAt(k));
		}
		
		out.println("Del 4");
		int tall = 7569;
		int hjelp = tall;
		int aS = 0;
		do {
			hjelp = hjelp / 10;
			aS = aS + 1;
		} while (hjelp > 0);
		
		out.println(tall + " har " + aS + " siffer.");
	}
}