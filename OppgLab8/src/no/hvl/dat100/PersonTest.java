package no.hvl.dat100;

public class PersonTest {
	public static void main(String[] args) {
		Person[] samling = new Person[4];
		Student p1 = new Student("Olsen", "Petter", 1997, 'm', 125634, "Data-A");
		Student p2 = new Student("Myrdal", "Stine", 1996, 'k', 125635, "Inf-B");
		Lærer p3 = new Lærer("Olafsen", "Hans-Jakob", 1982, 'm', 38000, 438);
		Lærer p4 = new Lærer("Simonsen", "Helene", 1974, 'k', 42000, 439);
		
		samling[0] = p1;
		samling[1] = p2;
		samling[2] = p3;
		samling[3] = p4;
		
		for (Person i : samling) {
			System.out.println(i.toString());
		}
	}
}