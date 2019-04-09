package no.hvl.dat100;

public class Ansatt {
	private int ansNr;
	private String fornavn;
	private String etternavn;
	private int lønn;
	
	public Ansatt() {
		ansNr = 0;
		fornavn = null;
		etternavn = null;
		lønn = 0;
	}
	
	public Ansatt(int ansNr, String fornavn, String etternavn, int lønn) {
		this.ansNr = ansNr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
		this.lønn = lønn;
	}
	
	public String toString() {
		return "Ansattnr: " + ansNr + " Navn: " + fornavn + " " + etternavn + " Lønn: " + lønn;
	}
}
