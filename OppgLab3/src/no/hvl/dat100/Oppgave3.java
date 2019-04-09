package no.hvl.dat100;

import static java.lang.System.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import static java.lang.Math.*;

public class Oppgave3 {
	public static void main(String[] args) {
		String[] kolonneNavn = {"x i grader", "x i radianer", "sin(x)", "cos(x)"};
		for (int i = 0; i < kolonneNavn.length; i++) {
			if (kolonneNavn[i].length() == 6) {
				out.print("    " + kolonneNavn[i]);
			} else {
				out.print("  " + kolonneNavn[i]);
			}
		}
		
		out.println();
		out.println("------------------------------------------------");
		
		final int ANT_GRADER = 180/15+1;
		String m1 = "           ";
		String m2 = "          ";
		String m3 = "         ";
		String m4 = "     ";
		String m5 = "    ";
		NumberFormat formatter = new DecimalFormat("#0.000");
		
		double[][] tabell = new double[ANT_GRADER][kolonneNavn.length];
		
		for (int i = 0; i < ANT_GRADER; i++) {
			for (int j = 0; j < kolonneNavn.length; j++) {
				if (j == 0) {
					tabell[i][j] = 15*i;
					if (tabell[i][j] == 0) {
						out.print(m1 + tabell[i][j]);
					} else if (tabell[i][j]/100 < 1) {
						out.print(m2 + tabell[i][j]);
					} else {
						out.print(m3 + tabell[i][j]);
					}
				} else if (j == 1) {
					double radianer = (tabell[i][j-1]*PI)/180;
					tabell[i][j] = radianer;
					out.print(m3 + formatter.format(tabell[i][j]));
				} else if (j == 2) {
					double sin = sin(tabell[i][j-1]);
					tabell[i][j] = sin;
					out.print(m4 + formatter.format(tabell[i][j]));
				} else {
					double cos = cos(tabell[i][j-2]);
					tabell[i][j] = cos;
					if (cos >= 0) {
						out.print(m4 + formatter.format(tabell[i][j]));
					} else {
						out.print(m5 + formatter.format(tabell[i][j]));
					}
				}
			}
			out.println();
		}
	}
}