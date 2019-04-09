package no.hvl.dat100;

import java.util.Arrays;
import java.util.Random;
import static java.lang.System.*;

public class Terningkast {
	public static void main(String[] args) {
		Random terning = new Random();
		int[] terningSim = new int[100];
		String resultat = "";
		int[] antall = new int[6];
		String ant = "";
		double snitt = 0;

		out.println("TERNINGKASTSIMULATOR");
		out.println();

		for (int i = 0; i < terningSim.length; i++) {
			terningSim[i] = (terning.nextInt(6) + 1);
		}

		for (int i = 0; i < terningSim.length; i++) {
			if (i == 19 || i == 39 || i == 59 || i == 79 || i == 99) {
				resultat += String.format("%-4s", terningSim[i]) + "\n";
			} else {
				resultat += String.format("%-4s", terningSim[i]);
			}
		}

		for (int i : terningSim) {
			if (i == 1) {
				antall[0]++;
			} else if (i == 2) {
				antall[1]++;
			} else if (i == 3) {
				antall[2]++;
			} else if (i == 4) {
				antall[3]++;
			} else if (i == 5) {
				antall[4]++;
			} else {
				antall[5]++;
			}
			snitt += i;
		}

		out.println(resultat);
		for (int i = 0; i < antall.length; i++) {
			ant += String.format("%-13s", "Antall " + (i + 1) + "-ere") + ":" + String.format("%4s", antall[i]) + "\n";
		}

		out.println(String.format("%-13s", "Antall kast") + ":" + String.format("%4s", terningSim.length));
		out.println(ant);

		out.println();

		snitt = (snitt + 0.5) / 100.0;
		out.println("Gjennomsnittskast : " + snitt);

		out.println();

		boolean funnet = false;
		int antFor6 = 0;
		do {
			if (terningSim[antFor6] == 6) {
				funnet = true;
			}
			antFor6++;
		} while (!funnet);
		out.println("Antall kast for å få den første 6-eren : " + antFor6);

		out.println();

		int count = 1, tempCount;
		int popular = terningSim[0];
		int temp = 0;
		for (int i = 0; i < (terningSim.length - 1); i++) {
			temp = terningSim[i];
			tempCount = 0;
			for (int j = 1; j < terningSim.length; j++) {
				if (temp == terningSim[j])
					tempCount++;
			}
			if (tempCount > count) {
				popular = temp;
				count = tempCount;
			}
		}
		out.println("Terningverdien det var flest av : " + popular);
	}
}