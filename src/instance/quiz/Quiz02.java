package instance.quiz;

import java.util.Calendar;

public class Quiz02 {

	public static void main(String[] args) {
		
		Order order = new Order();
//		Calendar datel = new Calendar();
		order.orberNum = 1;
//		order.orberDate = datal.set(2017,7,15);
		order.orberName = "홍길동";
		order.DeliveryAddress = "인천 연수구";
		
		order.showOrderInfo();
	}

}

class Order {
	int orberNum;
	Calendar orberDate;
	String orberName;
	String DeliveryAddress;
	
	public void showOrderInfo() {
		System.out.println("주문번호: " + orberNum +
						   " 주문날짜: " + orberDate +
						   " 주문자이름: " + orberName +
						   " 배송지: " + DeliveryAddress);
	}
}