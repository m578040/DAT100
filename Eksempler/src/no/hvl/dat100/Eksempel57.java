package no.hvl.dat100;

import static java.lang.System.*;

public class Eksempel57 {
	public static void main(String[] args) {
		String[][] timeplan = {
				{"nor", "eng", "mat", "nor", "eng"},
				{"gym", "ofa", "fri", "ofa", "kun"},
				{"ofa", "ofa", "gym", "mus", "kun"},
				{"mat", "nor", "gym", "mus", "mat"}
		};
		
		int[][] tabell;
		// ...
		int M = 1;
		int N = 2;
		// ...
		tabell = new int[M][N];
		
		out.println(timeplan[1][2]);
		out.println(tabell[0][0]);
	}
}