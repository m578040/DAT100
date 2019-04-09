package oppg4;

public class Tekst extends Innlegg {
	private String tekst;
	
	public Tekst(String bruker, String dato, String tekst) {
		super(bruker, dato);
		this.tekst = tekst;
	}
	
	public void skrivUt() {
		super.skrivUt();
		System.out.println("Tekst: " + tekst);
	}
}