package method.quiz;

public class Quiz04 {

	public static int minus(int n1, int n2) {

		if (n1 > n2) {
			return n1 - n2;
		} else {
			return -999;
		}
	}

	public static void main(String[] args) {

		int n1 = 20;
		int n2 = 10;

		System.out.println(minus(n1, n2));
	}

}
