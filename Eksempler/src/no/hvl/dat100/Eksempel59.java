package no.hvl.dat100;

import static java.lang.System.*;

public class Eksempel59 {
	public static void main(String[] args) {
		final int ANT_OBS = 3;
		final int ANT_DAG = 7;
		int[][] temp = new int[ANT_OBS][ANT_DAG];
		
		temp[0][0] = 12; temp[0][1] = 9; temp[0][2] = 10; temp[0][3] = 12; temp[0][4] = 16; temp[0][5] = 16; temp[0][6] = 15;
		temp[1][0] = 18; temp[1][1] = 12; temp[1][2] = 17; temp[1][3] = 19; temp[1][4] = 22; temp[1][5] = 22; temp[1][6] = 23;
		temp[2][0] = 11; temp[2][1] = 11; temp[2][2] = 13; temp[2][3] = 12; temp[2][4] = 15; temp[2][5] = 14; temp[2][6] = 15;
		
		int[] obsSum = new int[ANT_OBS];
		int[] dagSum = new int[ANT_DAG];
		
		for (int obsNr = 0; obsNr < ANT_OBS; obsNr++) {
			for (int dagNr = 0; dagNr < ANT_DAG; dagNr++) {
				obsSum[obsNr] += temp[obsNr][dagNr];
				dagSum[dagNr] += temp[obsNr][dagNr];
			}
		}
		
		for (int obsNr = 0; obsNr < ANT_OBS; obsNr++) {
			out.print("obs " + (obsNr+1));
			for (int dagNr = 0; dagNr < ANT_DAG; dagNr++) {
				out.print("   " + temp[obsNr][dagNr]);
			}
			out.println("     " + obsSum[obsNr]/ANT_DAG);
		}
		
		out.print("snitt");
		for (int dagNr = 0; dagNr < ANT_DAG; dagNr++) {
			out.print("   " + dagSum[dagNr]/ANT_OBS);
		}
		out.println();
	}
}