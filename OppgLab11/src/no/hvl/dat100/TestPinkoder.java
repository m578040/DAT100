package no.hvl.dat100;

public class TestPinkoder {
	public static void main(String[] args) {
		Pinkoder pinkoder = new Pinkoder();
		
		pinkoder.registrerPinkode(98765, 1234);
		pinkoder.registrerPinkode(19384, 4321);
		pinkoder.registrerPinkode(47593, 1948);
		
		System.out.println(pinkoder.sjekkPinkode(98765, 1234));
		System.out.println(pinkoder.sjekkPinkode(98765, 4321));
		System.out.println(pinkoder.sjekkPinkode(98764, 1234));
		
		System.out.println();
		
		pinkoder.registrerPinkode(19384, 1234);
		System.out.println(pinkoder.sjekkPinkode(19384, 4321));
		System.out.println(pinkoder.sjekkPinkode(19384,	1234));	
	}
}