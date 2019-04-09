package no.hvl.dat100;

public class Person {
	private String etternavn;
	private String fornavn;
	private int fødselsår;
	private char kjønn;
	
	public Person() {
		etternavn = null;
		fornavn = null;
		fødselsår = 0;
		kjønn = '\u0000';
	}
	
	public Person(String etternavn, String fornavn, int fødselsår, char kjønn) {
		this.etternavn = etternavn;
		this.fornavn = fornavn;
		this.fødselsår = fødselsår;
		this.kjønn = kjønn;
	}
	
	public String toString() {
		return fornavn + " " + etternavn + " Født: " + fødselsår + " Kjønn: " + kjønn;
	}

	public String getEtternavn() {
		return etternavn;
	}

	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}

	public String getFornavn() {
		return fornavn;
	}

	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	public int getFødselsår() {
		return fødselsår;
	}

	public void setFødselsår(int fødselsår) {
		this.fødselsår = fødselsår;
	}

	public char getKjønn() {
		return kjønn;
	}

	public void setKjønn(char kjønn) {
		this.kjønn = kjønn;
	}
}