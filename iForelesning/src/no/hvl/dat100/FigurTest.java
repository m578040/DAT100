package no.hvl.dat100;

public class FigurTest {
	public static void main(String[] args) {
		Trekant t = new Trekant(3, 3);
		System.out.println(t.equals(t));
		System.out.println(t.areal());
		t.tegn('%');
	}
}