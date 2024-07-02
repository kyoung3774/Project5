package method;

public class Ex03 {

	// 숫자 1~10까지 출력하는 함수 선언
	public static void printTen() {

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {

		printTen();
		printTen();
		printTen();
	}

}
