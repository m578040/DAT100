package no.hvl.dat100;

public class TestReparatør {
	public static void main(String[] args) {
		Reparatør a1 = new Reparatør(1, "Christian", "Norill", 900000, "Lampe");
		Reparatør a2 = new Reparatør(2, "Jon", "Vollset", 100, "Jacuzzi");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
	}
}