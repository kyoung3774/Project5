package instance.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person("지지", 30, true, 1);

		person1.name = "아무개";
		person1.age = 40;
		person1.maritalStatus = false;
		person1.child = 0;

		person1.showPersonInfo();
		person2.showPersonInfo();

	}

}

class Person {
	String name;
	int age;
	boolean maritalStatus;
	int child;

	Person() {
	};

	Person(String name, int age, boolean maritalStatus, int child) {
		this.name = name;
		this.age = age;
		this.maritalStatus = maritalStatus;
		this.child = child;
	};

	public void showPersonInfo() {
		System.out.println("이름: " + name + ", 나이: " + age + ", 결혼 여부: " + maritalStatus + ", 자식수: " + child);
	}
}
