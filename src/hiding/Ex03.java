package hiding;

public class Ex03 {

	public static void main(String[] args) {

		Person person = new Person();
		person.setName("둘리");
		person.setHeight(160);
		person.setWeigtht(50);

		System.out.println("이름:" + person.getName());
		System.out.println("키:" + person.getHeight() + "cm");
		System.out.println("몸무게:" + person.getWeigtht() + "kg");
	}

}

class Person {
	private String name;
	private int height;
	private double weigtht;

	// name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// height
	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// weight
	public double getWeigtht() {
		return weigtht;
	}

	public void setWeigtht(double weigtht) {
		this.weigtht = weigtht;
	}

}