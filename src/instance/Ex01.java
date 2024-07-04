package instance;

public class Ex01 {

	public static void main(String[] args) {

		Student student = new Student();

		student.studentID = 1001;
		student.studentName = "둘리";
		student.grade = 2;
		student.address = "인천 연수구";

		System.out.println("학생의 모든 정보를 출력합니다.");
		System.out.println("StudentID = " + student.studentID);
		System.out.println("StudentName = " + student.studentName);
		System.out.println("grade = " + student.grade);
		System.out.println("address = " + student.address);
		System.out.println();
		student.showStudentInfo();

		System.out.println("객체의 주소: " + student);
	}

}
