package oppg1;

public class E {
	public static void main(String[] args) {
		/*
		 * #1
		 */
		
		e();
	}

	public static String httpcheck(String navn) {
		if (navn.contains("http://")) {
			return navn;
		} else {
			return null;
		}

	}

	public static void e() {
		String str = httpcheck("www.google.com");
		try {
			System.out.println(str.length());
		} catch (NullPointerException exn) {
			System.out.println("#1");
		} catch (Exception exn) {
			System.out.println("#2");
		}
	}
}