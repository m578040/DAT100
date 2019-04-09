package oppg1;

public class Oppgave1 {

	public static void main(String[] args) {
		oppgave1a();

		int a = 42;
		int z = cmp(a, 31);
		System.out.println(z);

		oppgave1c();

		System.out.println("A");
		a(5);
		System.out.println("B");
	}

	public static void oppgave1a() {
		int x = 4;
		int y = 10;
		System.out.println(x * 4 + y * 3);
		System.out.println("x * y = " + x * y);
		System.out.println(x != y);
		String s = "dat100";
		System.out.println(s.substring(1, 3).equals("dat"));
	}

	public static int cmp(int x, int y) {
		int v;
		if (x > y) {
			v = 1;
		} else if (x < y) {
			v = -1;
		} else {
			v = 0;
		}
		return v;
	}

	public static void oppgave1c() {
		int[] tab = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < tab.length; i++) {
			if (i % 2 != 0) {
				System.out.println(i);
			}
		}
	}

	public static void a(int x) {
		try {
			b(x - 5);
		} catch (Exception exn) {
			System.out.println("C");
		}
	}

	public static void b(int x) throws Exception {
		System.out.println("D");
		if (x == 0) {
			throw new Exception("E");
		} else {
			System.out.println("F");
		}
	}

	/*
	 * 1a:
	 * 46
	 * x * y = 40
	 * true
	 * false
	 * 
	 * 1b:
	 * 1
	 * 
	 * 1c:
	 * 1
	 * 3
	 * 5
	 * 
	 * 1d:
	 * A
	 * D
	 * C
	 * B
	 */
}