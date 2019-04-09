package no.hvl.dat100;

import static java.lang.System.*;

public class Vare {
	public static void main(String[] args) {
		int[] vareNr = { 1, 2, 3, 4 };
		String[] vareNavn = { "Spade", "Hakke", "Spett", "Øks" };
		double[] pris = { 220.50, 199.00, 170.00, 249.50 };
		int[] antall = { 23, 17, 58, 12 };

		Vare[] vareTab = new Vare[4];

		for (int i = 0; i < vareTab.length; i++) {
			vareTab[i] = new Vare(vareNr[i], vareNavn[i], pris[i], antall[i]);
		}

		String utTxt = "Vareliste:" + "\n";
		for (int i = 0; i < 4; i++)
			utTxt += vareTab[i].toString() + "\n";
		out.println(utTxt);

		out.println();

		out.println("Samlet verdi av varelageret uten mva:");
		out.println((verdi(vareTab[0].pris, vareTab[0].antall) + verdi(vareTab[1].pris, vareTab[1].antall)
				+ verdi(vareTab[2].pris, vareTab[2].antall) + verdi(vareTab[3].pris, vareTab[3].antall)));

		out.println();

		out.println("Samlet verdi av varelageret med mva:");
		out.println(
				(verdi(prisMva(vareTab[0].pris), vareTab[0].antall) + verdi(prisMva(vareTab[1].pris), vareTab[1].antall)
						+ verdi(prisMva(vareTab[2].pris), vareTab[2].antall)
						+ verdi(prisMva(vareTab[3].pris), vareTab[3].antall)));
	}

	int nr;
	String navn;
	double pris;
	int antall;

	public Vare(int nr, String navn, double pris, int antall) {
		this.nr = nr;
		this.navn = navn;
		this.pris = pris;
		this.antall = antall;
	}

	public Vare(int nr, String navn, double pris) {
		this.nr = nr;
		this.navn = navn;
		this.pris = pris;
		this.antall = 0;
	}

	public Vare(int nr, String navn) {
		this(nr, navn, 0, 0);
	}

	public static double prisMva(double pris) {
		return pris * 1.25;
	}

	public static double verdi(double pris, int antall) {
		return pris * antall;
	}

	public String toString() {
		return nr + " - " + String.format("%-5s", navn) + " - " + pris + " - " + antall;
	}
}