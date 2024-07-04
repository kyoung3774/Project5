package instance;

public class Ex03 {

	public static void main(String[] args) {
		
		Car car = new Car();
		car.setStatus(true);
		car.showStatus();
	}

}

//자동차를 정의하는 클래스
class Car {

	boolean status; // 현재 상태

	// 현재 상태를 변경하는 메소드 선언
	public void setStatus(boolean stt) {
		status = stt;
	}

	// 현재 상태를 출력하는 메소드 선언
	public void showStatus() {
		System.out.println(status);
	}
}