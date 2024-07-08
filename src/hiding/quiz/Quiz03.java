package hiding.quiz;

public class Quiz03 {

	public static void main(String[] args) {

		MyDate3 myDate = new MyDate3();
		myDate.setMonth(1);
		myDate.setDay(30);

		System.out.println("월:" + myDate.getMonth());
		System.out.println("일:" + myDate.getDay());
	}

}

class MyDate3 {
	private int month;
	private int day;

	// month
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month < 1 || month > 12) {
			System.out.println("잘못된 month값");
			return;
		}
		this.month = month;
	}

	// day
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		if (month == 2) {
			if (day < 1 || day > 28) {
				System.out.println("2월에는 " + day + "일이 없습니다.");
				return; // 함수 종료
			}
		}
		if (day < 1 || day < 31) {
			System.out.println("실패");
			return;
		}
		this.day = day;
	}

}