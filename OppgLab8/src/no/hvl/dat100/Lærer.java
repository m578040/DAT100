package no.hvl.dat100;

public class Lærer extends Person {
	private int månedslønn;
	private int kontornummer;

	public Lærer() {
			super();
			månedslønn = 0;
			kontornummer = 0;
		}

	public Lærer(String etternavn, String fornavn, int fødselsår, char kjønn, int månedslønn, int kontornummer) {
			super(etternavn, fornavn, fødselsår, kjønn);
			this.månedslønn = månedslønn;
			this.kontornummer = kontornummer;
		}

	public String toString() {
		return super.toString() + " Månedslønn: " + månedslønn + " Kontornummer: " + kontornummer;
	}

	public int getMånedslønn() {
		return månedslønn;
	}

	public void setMånedslønn(int månedslønn) {
		this.månedslønn = månedslønn;
	}

	public int getKontornummer() {
		return kontornummer;
	}

	public void setKontornummer(int kontornummer) {
		this.kontornummer = kontornummer;
	}
}
