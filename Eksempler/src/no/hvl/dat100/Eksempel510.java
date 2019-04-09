package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Integer.*;

public class Eksempel510 {
	public static void main(String[] args) {
		final int ANT_SALER = 2;
		final int ANT_FILMER = 3;
		final int ANT_RADER = 15;
		final int ANT_SETER = 20;
		
		boolean[][][][] opptatt = new boolean[ANT_SALER][ANT_FILMER][ANT_RADER][ANT_SETER];
		
		int sal = parseInt(showInputDialog("Oppgi hvilken sal du vil se film i:"));
		int film = parseInt(showInputDialog("Oppgi hvilken film du vil se:"));
		
		out.print("   ");
		for (int seteNr = 0; seteNr < ANT_SETER; seteNr++) {
			out.print(" " + (seteNr+1)%10);
		}
		out.println();
		
		for (int radNr = 0; radNr < ANT_RADER; radNr++) {
			if (radNr < 9) {
				out.print(" ");
			}
			out.print((radNr+1) + " ");
			for (int seteNr = 0; seteNr < ANT_SETER; seteNr++) {
				if (opptatt[sal][film][radNr][seteNr]) {
					out.print(" X");
				} else {
					out.print(" _");
				}
			}
			out.println();
		}
	}
}