package no.hvl.dat100;
import static java.lang.System.*;
import java.util.*;

public class Eksempel710 {
	public static void main(String[] args) {
		String filter = args[0];
		Scanner stdin = new Scanner(in);
		String linje;
		while (stdin.hasNextLine()) {
			linje = stdin.nextLine();
			if (linje.matches("(.)*" + filter + "(.)*") ) {
				out.println(linje);
			}
		}
		stdin.close();
	}
}