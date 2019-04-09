package oppg2;

public class Sang {
	private String tittel;
	private int tid;
	private Sjanger genre;
	
	public Sang(String tittel, int tid, Sjanger genre) {
		this.tittel = tittel;
		this.tid = tid;
		this.genre = genre;
	}
	
	public void setTittel(String tittel) {
		this.tittel = tittel;
	}
	
	public String getTittel() {
		return tittel;
	}
	
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public int getTid() {
		return tid;
	}
	
	public void setGenre(Sjanger genre) {
		this.genre = genre;
	}
	
	public Sjanger getGenre() {
		return genre;
	}
	
	public void skrivUt() {
		System.out.println("Tittel: " + tittel + ", Tid: " + tid + " sekunder, Sjanger: " + genre);
	}
}