package method.quiz;

public class Quiz06 {

	public static void calculator_switch(int n1, int n2, char n3) {

		switch (n3) {
		case '+':
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
			break;
		case '-':
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
			break;
		case '*':
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
			break;
		case '/':
			if (n1 == 0 || n2 == 0) {
				System.out.println("나눌 수 없는 수");
			} else {
				System.out.println(n1 + " / " + n2 + " = " + ((double)n1 / n2));
				break;
			}
		}
	}
	
	public static void calculator_ifElse(int n1, int n2, char n3) {
		
		if(n3 == '+') {
			System.out.println(n1 + " + " + n2 + " = " + (n1 + n2));
		}else if(n3 == '-') {
			System.out.println(n1 + " - " + n2 + " = " + (n1 - n2));
		}else if(n3 == '*') {
			System.out.println(n1 + " * " + n2 + " = " + (n1 * n2));
		}else if(n3 == '/') {
			if (n1 == 0 || n2 == 0) {
				System.out.println("나눌 수 없는 수");
			} else {
				System.out.println(n1 + " / " + n2 + " = " + ((double)n1 / n2));
			}
		}
	}

	public static void main(String[] args) {

		int n1 = 2;
		int n2 = 2;
		char n3 = '/';

		calculator_switch(n1, n2, n3);
		calculator_ifElse(n1, n2, n3);		
	}

}
