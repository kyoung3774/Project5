package constructor.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		Car car1 = new Car();
		Car car2 = new Car("기아", "레이", "검정색", 150);
		
		car1.company = "현대";
		car1.model = "쏘나타";
		car1.color = "흰색";
		car1.maxSpeed = 200;
		
		car1.showCarInfo();
		System.out.println(car1);
		System.out.println();
		car2.showCarInfo();
		System.out.println(car2);
		System.out.println();
	}
}

class Car {

	String company;
	String model;
	String color;
	int maxSpeed;

	public Car() {
		super();
	}

	public Car(String company, String model, String color, int maxSpeed) {
		super();
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	public void showCarInfo() {
		System.out.println(company + " / " + model + " / " + color + " / " + maxSpeed);
	}
}