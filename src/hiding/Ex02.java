package hiding;

public class Ex02 {

	public static void main(String[] args) {

		MyDate2 date2 = new MyDate2();
		date2.setMonth(2);
		date2.setDay(30);

		System.out.println("현재날짜는 " + date2.getMonth() + "월" + date2.getDay() + "일 입니다.");

		date2.setDay(10);
		System.out.println("현재날짜는 " + date2.getMonth() + "월" + date2.getDay() + "일 입니다.");

	}

}

class MyDate2 {
	private int month; // 月
	private int day; // 日

	// 月을 가져오는 메소드
	public int getMonth() {
		return month;
	}

	// 月을 변경하는 메소드
	public void setMonth(int month) {
		if (month > 12) {
			return; // 함수 종료
		}
		this.month = month;
	}

	// 日을 가져오는 메소드
	public int getDay() {
		return day;
	}

	// 日을 변경하는 메소드
	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("2월에는 " + day + "일이 없습니다.");
				return; // 함수 종료
			}
		}
		this.day = day;
	}

}
