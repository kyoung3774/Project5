package method.quiz;

public class Quiz02 {

	public static int addAll(int n1, int n2) {

		int result = 0;

		for (int i = n1; i <= n2; i++) {
			result += i;
		}
		return result;
	}

	public static void main(String[] args) {

		int n1 = 5;
		int n2 = 10;

		System.out.println(n1 + " ~ " + n2 + "까지의 합: " + addAll(n1, n2));
	}

}
