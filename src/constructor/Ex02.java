package constructor;

public class Ex02 {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		Person person2 = new Person("나나나",170,70);
		
		person1.name = "가가가";
		person1.height = 180;
		person1.weight = 80;
		
		person1.showPersonInfo();
		person2.showPersonInfo();
	}

}

class Person {
	
	String name;
	int height;
	int weight;
	
	Person(){};
	
	Person(String name, int height, int weight){
		this.name = name;
		this.height = height;
		this.weight = weight;		
	};
	public void showPersonInfo() {
		System.out.println("이름:" + name +
						   " / 키:" + height +
						   " / 몸무게:" + weight);
	}
}
