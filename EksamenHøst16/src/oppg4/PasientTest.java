package oppg4;

public class PasientTest {
	public static void main(String[] args) {
		Pasient p1 = new Pasient("Jon Vollset", "23129512345");
		Pasient p2 = new Pasient("Morten Tordal", "26119947560");
		
		Venteliste vListe = new Venteliste(2);
		vListe.leggTil(p1);
		vListe.oppdaterDager(10);
		vListe.leggTil(p2);
		vListe.skrivUt();
	}
}