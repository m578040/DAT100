package no.hvl.dat100;

public class Eksempel26 {
	public static void main(String[] args) {
		int pris = 124;
		int beløp = 200;
		int veksel = beløp - pris;
		int ant10kr = veksel/10;
		int ant1kr = veksel%10;
	}
}