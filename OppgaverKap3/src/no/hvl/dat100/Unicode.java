package no.hvl.dat100;

public class Unicode {
	public static void main(String[] args) {
		for (int i = 32; i <= 126; i++) {
			char tegn = (char) i;
			System.out.println("Kodenummer: " + i + " = " + tegn);
		}
	}
}