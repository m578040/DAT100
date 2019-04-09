package no.hvl.dat100;

public class Bil implements Sammenlignbar {
	private static int nesteNummer = 1;
	private int id;
	private String regNr;
	
	public Bil(String regNr) {
		id = nesteNummer;
		nesteNummer++;
		this.regNr = regNr;
	}
	
	public String toString() {
		return "Id: " + id + "Regnr: " + regNr;
	}
	
	public boolean mindreEnn(Sammenlignbar annen) {
		Bil b = (Bil) annen;
		return regNr.compareTo(b.regNr) < 0;
	}
}