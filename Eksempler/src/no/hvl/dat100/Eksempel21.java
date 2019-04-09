package no.hvl.dat100;

 
public class Eksempel21 {
  public static void main(String[] args) {
	  int x = 5;	// x er lik 5
	  int y = 8;	// x er lik 5, y er lik 8
	  int h = x;	// x er lik 5, y er lik 8, h er lik 5
	  x = y;		// x er lik 8, y er lik 8, h er lik 5
	  y = h;		// x er lik 8, y er lik 5, h er lik 5
  }
}