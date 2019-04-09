package no.hvl.dat100;
import static java.lang.Math.*;

public class Kvadrattall {
	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			double ktall = pow(i,2);
			System.out.println(ktall + " = " + i + " x " + i);
		}
	}
}