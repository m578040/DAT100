package no.hvl.dat100;
import static java.lang.System.*;

public class VarelagerKlient {
	public static void main(String[] args) {
		Varelager varelager = new Varelager(10);
		
		Vare v1 = new Vare(123, "Frogskins", 990);
		Vare v2 = new Vare(213, "Flight deck", 1268);
		Vare v3 = new Vare(321, "Jawbreaker", 1200);
		Vare v4 = new Vare(412, "Fall line", 950);
		Vare v5 = new Vare(532, "Holbrook", 739);
		
		varelager.leggTil(v1);
		varelager.leggTil(v2);
		varelager.leggTil(v3);
		varelager.leggTil(v4);
		varelager.leggTil(v5);
		
		out.println(varelager.toString());
		
		out.println();
		
		out.println("Total pris for varelageret: " + varelager.totalPris());
		
		varelager.slett(2);
		
		out.println();
		
		out.println(varelager.toString());
	}
}