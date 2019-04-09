package no.hvl.dat100;

public class Variabelbytte {
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		int z = 30;
		int h = x;
		x = y;
		y = z;
		z = h;
		System.out.println(x + " " + y + " " + z);
	}
}