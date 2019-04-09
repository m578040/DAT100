package no.hvl.dat100;
import static java.lang.Integer.*;
import static javax.swing.JOptionPane.*;

public class KlientStudent {

	public static void main(String[] args) {
		Student malin = new Student(131618, "Malin", "Dal");
		System.out.println(malin);
		lesStudent(malin);
		System.out.println(malin);
		
		/*
		Student malin = new Student(131618, "Malin", "Dal");
		Student ole = new Student(141718, "Ole", "Olsen");
		Student ole2 = new Student(141718, "", "");
		
		System.out.println(malin);
		System.out.println(ole);
		
		if (malin.erLik(ole)) {
			System.out.println("Like");
		} else {
			System.out.println("Ulike");
		}
		
		if (ole.erLik(ole2)) {
			System.out.println("Like");
		} else {
			System.out.println("Ulike");
		}
		*/
	}
	
	static void lesStudent(Student enStudent) {
		String tallTxt = showInputDialog("Oppgi studentNr: ");
		int nr = parseInt(tallTxt);
		enStudent.setStudentNr(nr);
		String fnavn = showInputDialog("Oppgi fornavn: ");
		enStudent.setFornavn(fnavn);
		String enavn = showInputDialog("Oppgi etternavn: ");
		enStudent.setEtternavn(enavn);
	}
}