package method.quiz;

public class Quiz07 {

	public static void sum(int n1) {

		int hundred = n1 / 100;
		int tens = (n1 % 100) / 10;
		int ones = (n1 % 100) % 10;

		System.out.println(hundred + " + " + tens + " + " + ones + " = " + (hundred + tens + ones));
	}

	public static void main(String[] args) {

		sum(932);
	}

}
