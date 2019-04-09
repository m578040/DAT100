package no.hvl.dat100;

import java.util.*;

public class Pinkoder {
	private HashMap<Integer, Integer> pinkoder;
	
	public Pinkoder() {
		pinkoder = new HashMap<Integer, Integer>();
	}
	
	public void registrerPinkode(Integer kortnummer, Integer pinkode) {
		pinkoder.put(kortnummer, pinkode);
	}
	
	public boolean sjekkPinkode(Integer kortnummer, Integer pinkode) {
		if (pinkoder.containsKey(kortnummer)) {
			return pinkoder.get(kortnummer).equals(pinkode);
		} else {
			return false;
		}
	}
}