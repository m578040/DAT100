package no.hvl.dat100;

import static java.lang.System.*;

public class Eksempel58 {
	public static void main(String[] args) {
		final int ANT_AVD = 4;
		final int ANT_MND = 12;
		double[][] salgstall = new double[ANT_AVD][ANT_MND];
		
		salgstall[3][9] = 1250.0;
		out.println(salgstall[3][9]);
	}
}