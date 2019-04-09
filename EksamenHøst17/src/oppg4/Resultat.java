package oppg4;

public abstract class Resultat {
	private String navn;
	private char kjønn;
	
	public Resultat(String navn, char kjønn) {
		this.navn = navn;
		this.kjønn = kjønn;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setKjønn(char kjønn) {
		this.kjønn = kjønn;
	}
	
	public char getKjønn() {
		return kjønn;
	}
	
	public abstract int poeng();
}