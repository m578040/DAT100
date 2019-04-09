package oppg4;

public class Innlegg {
	private String bruker;
	private String dato;
	private int likes;
	
	public void setBruker(String bruker) {
		this.bruker = bruker;
	}
	
	public String getBruker() {
		return bruker;
	}
	
	public void setDato(String dato) {
		this.dato = dato;
	}
	
	public String getDato() {
		return dato;
	}
	
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public int getLikes() {
		return likes;
	}
	
	public Innlegg(String bruker, String dato) {
		this.bruker = bruker;
		this.dato = dato;
		likes = 0;
	}
	
	public void skrivUt() {
		System.out.println("Bruker: " + bruker + ", Dato: " + dato + ", Likes: " + likes);
	}
	
	public void atLike() {
		likes++;
	}
}