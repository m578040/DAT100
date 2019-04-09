package no.hvl.dat100;

import static javax.swing.JOptionPane.*;
import static java.lang.System.*;
import static java.lang.Double.*;

public class Oppgave4 {
	public static void main(String[] args) {
		double[] temp = new double[7];
		out.println("Analyse av temperaturer");
		out.println("***********************");
		out.println("Skriv inn temperaturene:");
		
		for (int i = 0; i < temp.length; i++) {
			temp[i] = parseDouble(showInputDialog("Oppgi temperaturen for dag " + (i+1) + ":"));
			out.println((i+1) + ". dag: " + temp[i]);
		}
		
		out.println();
		double sum = 0;
		
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		
		double snitt = ((int)(sum/temp.length*10+0.5))/10;
		out.println("Gjennomsnittstemperaturen var " + snitt);
		
		double høyest = 0.0;
		
		for (int i = 0; i < temp.length; i++) {
			if (høyest < temp[i]) {
				høyest = temp[i];
			}
		}
		
		out.println("Maksimum for denne uken var " + høyest + " grader.");
	}
}