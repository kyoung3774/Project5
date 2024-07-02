package method;

public class Ex01 {

	// 1.매개변수, 리턴타입이 없는 메소드입니다.
	public static void method1() {
		System.out.println("매개변수, 리턴타입이 없는 메소드입니다.");
		return; // 반환타입(void)는 생략가능
	}

	// 2.매개변수가 없지만, 반환값이 있는 메소드
	public static String method2() {
		return "매개변수가 없지만, 반환값이 있는 메소드";
	}

	// 3.매개 변수가 있고 반환값이 없는 메소드
	public static void method3(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println("sum: " + sum);
	}

	// 4.매개변수가 있고 반환값이 있는 메소드
	public static int method4(int num1, int num2) {
		return num1 + num2;
	}

	public static void main(String[] args) {

		method1();

		String str = method2();
		System.out.println(str);

		method3(1, 2);

		int i = method4(1, 2);
		System.out.println(i);
	}

}
