package eksempel67;

public class Student {
	static int nesteLedige = 1;
	
	int studNr;
	String fornavn;
	String etternavn;
	
	public Student(String fornavn, String etternavn) {
		studNr = nesteLedige++;
		this.fornavn = fornavn;
		this.etternavn = etternavn;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student("Per", "Karlsen");
		Student s2 = new Student("Lise", "Mo");
	}
}
