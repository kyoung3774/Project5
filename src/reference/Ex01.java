package reference;

public class Ex01 {

	public static void main(String[] args) {

		Subject math = new Subject("수학", 85);
		Subject korean = new Subject("국어", 100);

		Sutudent sutudent = new Sutudent(1001, "둘리", math, korean);
	}

}

class Subject {

	String subjectName;
	int scorePoint;

	public Subject() {
		super();
	}

	public Subject(String subjectName, int scorePoint) {
		super();
		this.subjectName = subjectName;
		this.scorePoint = scorePoint;
	}

}

class Sutudent {

	int studentID;
	String studentName;
	Subject math;
	Subject korean;

	public Sutudent() {
		super();
	}

	public Sutudent(int studentID, String studentName, Subject math, Subject korean) {
		super();
		this.studentID = studentID;
		this.studentName = studentName;
		this.math = math;
		this.korean = korean;
	}

}