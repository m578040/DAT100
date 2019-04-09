package oppg2;

public class Kommune {
	private String navn;
	private double areal;
	private int folketall;
	
	public Kommune(String navn, double areal, int folketall) {
		this.navn = navn;
		this.areal = areal;
		this.folketall = folketall;
	}
	
	public void setNavn(String navn) {
		this.navn = navn;
	}
	
	public String getNavn() {
		return navn;
	}
	
	public void setAreal(double areal) {
		this.areal = areal;
	}
	
	public double getAreal() {
		return areal;
	}
	
	public void setFolketall(int folketall) {
		this.folketall = folketall;
	}
	
	public int getFolketall() {
		return folketall;
	}
	
	public String toString() {
		return navn + ", Folketall: " + folketall + ", Fastlandsareal: " + areal + " km2";
	}
	
	public double tetthet() {
		return folketall / areal;
	}
	
	
}