package no.hvl.dat100;

public class Sang {
	private String tittel;
	private int tid;
	private Sjanger genre;

	public Sang(String tittel, int tid, Sjanger genre) {
		this.tittel = tittel;
		this.tid = tid;
		this.genre = genre;
	}

	public String getTittel() {
		return tittel;
	}

	public void setTittel(String tittel) {
		this.tittel = tittel;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public Sjanger getGenre() {
		return genre;
	}

	public void setGenre(Sjanger genre) {
		this.genre = genre;
	}
	
	public void skrivUt() {
		System.out.println("Tittel: " + tittel + "\n" + "Tid: " + tid + "\n" + "Sjanger: " + genre + "\n");
	}
}