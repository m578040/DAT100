package no.hvl.dat100;
import static java.lang.Math.*;
import static java.lang.System.*;

public class Kvadrat {
	int sidelengde;
	
	public Kvadrat(int sidelengde) {
		this.sidelengde = sidelengde;
	}
	
	public double areal() {
		return pow(sidelengde, 2);
	}
	
	public double omkrets() {
		return sidelengde*4;
	}
	
	public double diagonal() {
		return sidelengde;
	}
	
	public void tegn() {
		for (int i = 0; i < sidelengde; i++) {
			for (int j = 0; j < sidelengde; j++) {
				out.print("* ");
			}
			out.println();
		}
	}
	
	public static boolean sum(Kvadrat sl1, Kvadrat sl2, Kvadrat sl3) {
		if (sl3.areal() == (sl1.areal() + sl2.areal())) {
			return true;
		} else if (sl2.areal() == (sl1.areal() + sl3.areal())) {
			return true;
		} else if (sl1.areal() == (sl2.areal() + sl3.areal())) {
			return true;
		} else {
			return false;
		}
	}
}