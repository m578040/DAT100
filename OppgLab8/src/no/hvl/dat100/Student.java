package no.hvl.dat100;

public class Student extends Person {
	private int studentnummer;
	private String klasse;

	public Student() {
		super();
		studentnummer = 0;
		klasse = null;
	}

	public Student(String etternavn, String fornavn, int fødselsår, char kjønn, int studentnummer, String klasse) {
		super(etternavn, fornavn, fødselsår, kjønn);
		this.studentnummer = studentnummer;
		this.klasse = klasse;
	}
	
	public String toString() {
		return super.toString() + " Studentnummer: " + studentnummer + " Klasse: " + klasse;
	}

	public int getStudentnummer() {
		return studentnummer;
	}

	public void setStudentnummer(int studentnummer) {
		this.studentnummer = studentnummer;
	}

	public String getKlasse() {
		return klasse;
	}

	public void setKlasse(String klasse) {
		this.klasse = klasse;
	}
}