package no.hvl.dat100;
import static java.lang.System.*;

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
	
	public static void main(String[] args) {
		 
	    Konto k1 = new Konto(100, 35000);
	    Konto k2 = new Konto(222, 15500);
	    Konto k3 = new Konto(321, 22100);
	 
	    String utTxt = "Kontoinformasjon" + "\n"
	           + "Konto nr.: " + k1.getKontonr() + "\n"
	           + "Saldo kr.: " + k1.getSaldo() + "\n";
	    out.println(utTxt);
	    
	    k1.setSaldo(100);
	    out.println(k1.getSaldo());
	 
	    double sumSaldo = k1.getSaldo() + k2.getSaldo() + k3.getSaldo() ;
	    out.println("Totalt saldo: kr " + sumSaldo);
	  }
}