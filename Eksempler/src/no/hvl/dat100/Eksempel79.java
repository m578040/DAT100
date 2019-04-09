package no.hvl.dat100;
import static java.lang.System.*;
import java.util.*;

public class Eksempel79 {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(in);
		while (stdin.hasNextLine()) {
			out.println(stdin.nextLine());
		}
		stdin.close();
	}
}