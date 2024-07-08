package hiding.quiz;

public class Quiz02 {

	public static void main(String[] args) {

		Car car = new Car();
		car.setCompany("현대");
		car.setModel("소나타");
		car.setColor("흰색");
		car.setMaxSpeed(200);
		
		System.out.println("제조사:" + car.getCompany());
		System.out.println("모델:" + car.getModel());
		System.out.println("색상:" + car.getColor());
		System.out.println("최고속도:" + car.getMaxSpeed());
	}

}

class Car {

	private String company;
	private String model;
	private String color;
	private int maxSpeed;

	// company
	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	// model
	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	// color
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// maxSpeed
	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}