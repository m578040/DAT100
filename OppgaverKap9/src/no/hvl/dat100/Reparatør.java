package no.hvl.dat100;

public class Reparatør extends Ansatt {
	private String produkt;
	
	public Reparatør() {
		super();
		produkt = null;
	}
	
	public Reparatør(int ansNr, String fornavn, String etternavn, int lønn, String produkt) {
		super(ansNr, fornavn, etternavn, lønn);
		this.produkt = produkt;
	}
	
	public String getProdukt() {
		return produkt;
	}
	
	public void setProdukt(String produkt) {
		this.produkt = produkt;
	}
	
	public String toString() {
		return super.toString() + " Produkt: " + produkt;
	}
}