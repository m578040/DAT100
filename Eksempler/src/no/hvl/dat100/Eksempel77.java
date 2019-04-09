package no.hvl.dat100;
import java.io.*;
import java.util.*;
import static java.lang.System.*;

public class Eksempel77 {
	public static void main(String[] args) throws Exception{
		Scanner leser = new Scanner(new File("tall.txt"));
		
		int sum = 0;
		while (leser.hasNextInt()) {
			sum += leser.nextInt();
		}
		leser.close();
		out.println("Sum: " + sum);
	}
}