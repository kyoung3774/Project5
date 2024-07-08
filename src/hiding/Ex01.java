package hiding;

public class Ex01 {

	public static void main(String[] args) {
		
		//public 접근 제어자 변수는 논리적으로 잘못된 값을 검증하지 못함
		MyDate date = new MyDate();
		date.month = 2;
		date.day = 31;
		System.out.println("현재날짜: " + date.month + "월 " + date.day + "일");
		
		
	}

}

class MyDate {
	//public 접근 제어자 변수는 논리적으로 잘못된 값을 검증하지 못함
	public int month; // 月
	public int day; // 日

}