package no.hvl.dat100;

import static java.lang.System.*;

public class Navn {
	private String fornavn;
	private String etternavn;
	
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = storForbokstav(fornavn);
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = storForbokstav(etternavn);
	}
	
	public String toString() {
		return etternavn + ", " + fornavn;
	}
	
	public Navn(String fornavn, String etternavn) {
		this.fornavn = storForbokstav(fornavn);
		this.etternavn = storForbokstav(etternavn);
	}
	
	public String storForbokstav(String navn) {
		navn = navn.toUpperCase();
		char forbokstav = navn.charAt(0);
		navn = navn.toLowerCase();
		
		return forbokstav + navn.substring(1);
	}
	
	public static void main(String[] args) {
		
		String[] fornavn = {"ole", "hans", "klaus", "olaf"};
		String[] etternavn = {"OLSEN", "HANSEN", "KLAUSEN", "OLAFSEN"};
		
		Navn[] navneliste = new Navn[fornavn.length];
		
		for (int i = 0; i < navneliste.length; i++) {
			navneliste[i] = new Navn(fornavn[i], etternavn[i]);
		}
		
		String utTxt = "Navneliste:" + "\n";
	    for (int i=0; i<4; i++)
	      utTxt += navneliste[i].toString() + "\n";
	    out.println(utTxt);
	 
	    navneliste[0].setFornavn("lars");
	    navneliste[0].setEtternavn("larsen");
	 
	    utTxt = "Navneliste:" + "\n";
	    for (int i=0; i<4; i++)
	      utTxt += navneliste[i].toString() + "\n";
	    out.println(utTxt);
	}
}