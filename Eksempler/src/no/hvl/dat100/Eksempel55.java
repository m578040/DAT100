package no.hvl.dat100;

import static java.lang.System.*;
import java.util.*;

public class Eksempel55 {
	public static void main(String[] args) {
		int[] lottoTall = {34, 2, 7, 16, 21, 29, 1};
		int[] minKupong = {7, 1, 34, 16, 2, 21, 29};
		
		Arrays.sort(lottoTall);
		Arrays.sort(minKupong);
		
		if (Arrays.equals(lottoTall, minKupong)) {
			out.println("Du har vunnet 1. premie!");
		}
	}
}