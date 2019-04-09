package no.hvl.dat100;

public class Vare {
	private int vareNr;
	private String navn;
	private double pris;

	// Standard konstruktør
	public Vare() {
		vareNr = 0;
		navn = "";
		pris = 0;
	}

	// Konstruktør med verdisetting
	public Vare(int vareNr, String navn, double pris) {
		this.vareNr = vareNr;
		this.navn = navn;
		this.pris = pris;
	}

	public int getVareNr() {
		return vareNr;
	}

	public void setVareNr(int vareNr) {
		this.vareNr = vareNr;
	}

	public String getNavn() {
		return navn;
	}

	public void setNavn(String navn) {
		this.navn = navn;
	}

	public double getPris() {
		return pris;
	}

	public void setPris(double pris) {
		this.pris = pris;
	}
	
	public String vareAlt() {
		return vareNr + ": " + navn + ", " + pris;
	}

	public double moms() {
		return pris * 0.2;
	}
	
	public boolean billigereEnn(Vare v) {
		boolean billigereEnn = true;
		if (v.pris <= pris) {
			billigereEnn = false;
		}
		return billigereEnn;
	}
	
	public String toString() {
		String txt = "Varenr: " + vareNr + " Navn: " + navn + " Pris: " + pris;
		return txt;
	}
}