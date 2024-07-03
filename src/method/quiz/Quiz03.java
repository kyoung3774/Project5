package method.quiz;

public class Quiz03 {

	public static int comparison(int n1, int n2) {

		if (n1 < n2) {
			return n2;
		} else {
			return n1;
		}
	}

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 5;
		
		Quiz03 Quiz03 = new Quiz03();
		
		System.out.println(Quiz03.comparison(n1, n2));
		System.out.println(comparison(n1, n2));
	}

}
