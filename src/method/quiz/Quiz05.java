package method.quiz;

public class Quiz05 {

	public static void divide1(int n1, int n2) {

		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
		} else {
			System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		}

	}

	public static void divide2(int n1, int n2) {

		if (n2 == 0) {
			System.out.println("나누는 수는 0이 될 수 없습니다.");
			return;
		}

		int result = n1 / n2;
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
	}

	public static void main(String[] args) {

		int n1 = 10;
		int n2 = 5;

		divide1(n1, n2);
		divide2(n1, n2);
	}

}
