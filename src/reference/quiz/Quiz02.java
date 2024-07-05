package reference.quiz;

public class Quiz02 {

	public static void main(String[] args) {
		
		Employee employee1 = new Employee("둘리",50,5000000,20);
		Employee employee2 = new Employee("또치",40,4000000,10);
		Employee employee3 = new Employee("도우너",30,3000000,5);
		
		Department department1 = new Department(employee1,null,null);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(department1);
	}

}

class Department {

	Employee head;
	Employee senior;
	Employee junior;

	public Department(Employee head, Employee senior, Employee junior) {
		super();
		this.head = head;
		this.senior = senior;
		this.junior = junior;
	}

}

class Employee {

	String name;
	int age;
	int monthly;
	int yers;

	public Employee(String name, int age, int monthly, int yers) {
		super();
		this.name = name;
		this.age = age;
		this.monthly = monthly;
		this.yers = yers;
	}

}