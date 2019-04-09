package no.hvl.dat100;

import static java.lang.Math.*;
import java.util.*;
import static java.lang.System.*;
import java.time.Duration;
import java.time.Instant;

public class Oppgave5 {
	public static void main(String[] args) {
		double[] tallTab = new double[1000000];
		
		for (int i = 0; i < tallTab.length; i++) {
			tallTab[i] = random();
		}
		
		Instant start = Instant.now();
		Arrays.sort(tallTab);
		Instant end = Instant.now();
		out.println(Duration.between(start, end).toMillis() + " ms");
	}
}