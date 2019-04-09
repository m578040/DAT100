package eksempel65;

public class Vare {
	public static void main(String[] args) {
		Vare v1 = new Vare(3, "Spett", 170.00, 58);
		Vare v2 = new Vare(4, "Øks", 249.50);
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
}