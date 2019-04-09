package no.hvl.dat100;

public class Konto {
	
	private int kontonr;
	private double saldo;
	
	public Konto(int kontonr, double saldo) {
		this.kontonr = kontonr;
		this.saldo = saldo;
	}

	public int getKontonr() {
		return kontonr;
	}

	public void setKontonr(int kontonr) {
		this.kontonr = kontonr;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo += saldo;
	}
}