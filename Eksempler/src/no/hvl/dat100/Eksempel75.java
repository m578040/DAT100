package no.hvl.dat100;
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Eksempel75 {
	public static void main(String[] args) throws Exception {
		String filnavn = "navn.txt";
		Scanner leser = new Scanner(new File(filnavn));
		leser.useDelimiter("\\.|?|!|");
		int antOrd = 0;
		String ord;
		while (leser.hasNext()) {
			ord = leser.next();
			out.println(ord);
			antOrd++;
		}
		out.println("Antall ord: " + antOrd);
		leser.close();
	}
}