package method.quiz;

public class Quiz01 {

	public static int add(int n1, int n2) {
		int result = n1 + n2;
		return result;
	}

	public static int minus(int n1, int n2) {
		int result = n1 - n2;
		return result;
	}

	public static int multiplication(int n1, int n2) {
		int result = n1 * n2;
		return result;
	}

	public static int division(int n1, int n2) {
		int result = n1 / n2;
		return result;
	}

	public static void four(int n1, int n2) {
		System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		System.out.println(n1 + " x " + n2 + " = " + (n1 * n2));
		System.out.println(n1 + " / " + n2 + " = " + (n1 / n2));
		System.out.println(n1 + " % " + n2 + " = " + (n1 % n2));

	}

	public static void main(String[] args) {

		System.out.println("5 + 5 = " + add(5, 5));
		System.out.println("5 - 5 = " + minus(5, 5));
		System.out.println("5 * 5 = " + multiplication(5, 5));
		System.out.println("5 / 5 = " + division(5, 5));
		System.out.println();
		four(5, 5);
	}

}
