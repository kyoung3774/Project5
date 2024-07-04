package method.quiz;

public class Quiz07 {

	public static void placeValueAdd(int n1) {
		
		int sum = 0;
		
		int hundred = n1 / 100;
		int tens = (n1 % 100) / 10;
		int untis = (n1 % 100) % 10;
		
		sum += n1/100;
		sum += (n1%100)/10;
		sum += (n1%100)%10;
		
		System.out.println(hundred + " + " + tens + " + " + untis + " = " + (hundred + tens + untis));
		System.out.println(hundred + " + " + tens + " + " + untis + " = " + sum);
	}

	public static void main(String[] args) {

		placeValueAdd(300);
	}

}
