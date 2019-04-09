package oppg3;

public class PinkoderTest {
	public static void main(String[] args) {
		Pinkoder pinkoder = new Pinkoder();
		
		pinkoder.registrerPinkode(123456, 1234);
		pinkoder.registrerPinkode(654321, 4321);
		
		System.out.println(pinkoder.sjekkPinkode(123456, 1234));
	}
}