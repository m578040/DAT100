package no.hvl.dat100;

import static java.lang.System.*;
import static java.lang.Math.*;
import java.util.*;

public class Eksempel56 {
	public static void main(String[] args) {
		int[] tallTab = {0, 7, 13, 19, 22, 28, 31};
		int tall = (int)(random()*34);
		
		int pos = Arrays.binarySearch(tallTab, tall);
		
		if (pos < 0) {
			pos = (-pos) - 2;
		}
		
		for (int i = 0; i < pos; i++) {
			tallTab[i] = tallTab[i+1];
		}
		
		tallTab[pos] = tall;
		
		for (int i = 0; i < tallTab.length; i++) {
			out.println(tallTab[i]);
		}
	}
}