package no.hvl.dat100;

public class Student {
	private int studentNr;
	private String fornavn;
	private String etternavn;
	
	public Student(int studentNr, String fornavn, String etternavn) {
		this.studentNr = studentNr;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}
	
	public Student() {
		this(0, "", "");
	}
	
	public int getStudentNr() {
		return studentNr;
	}
	public void setStudentNr(int studentNr) {
		this.studentNr = studentNr;
	}
	public String getFornavn() {
		return fornavn;
	}
	public void setFornavn(String fornavn) {
		this.fornavn = fornavn;
	}
	public String getEtternavn() {
		return etternavn;
	}
	public void setEtternavn(String etternavn) {
		this.etternavn = etternavn;
	}
	
	public boolean erLik(Student denAndre) {
		boolean lik = true;
		if (denAndre == null) {
			lik = false;
		} else {
			lik = this.studentNr == denAndre.studentNr;
		}
		return lik;
	}

	@Override
	public String toString() {
		return "Student [studentNr=" + studentNr + ", fornavn=" + fornavn + ", etternavn=" + etternavn + "]";
	}
	
}