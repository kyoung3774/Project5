package instance;

public class Student {

	int studentID; // 학번
	String studentName; // 이름
	int grade; // 학년
	String address; // 주소
	
	public void showStudentInfo() {
		System.out.println("학번: " + studentID +
						   ", 이름: " + studentName +
						   ", 학년: " + grade +
						   ", 주소: " + address);
	}
}
