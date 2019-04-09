package oppg4;

public class Bilde extends Innlegg {
	private String url;
	
	public Bilde(String bruker, String dato, String url) {
		super(bruker, dato);
		this.url = url;
	}
	
	public void skrivUt() {
		super.skrivUt();
		System.out.println("Url: " + url);
	}
}