package reference.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Book book1 = new Book("책1", 100, "책1", 100);
		Book book2 = new Book("책2", 200, "책2", 200);
		Book book3 = new Book("책3", 300, "책3", 300);

		Member member1 = new Member(1001, "회원1", book1);
		Member member2 = new Member(1002, "회원2", book2);
		Member member3 = new Member(1003, "회원3", book3);

		System.out.println(book1);
		System.out.println(book2);
		System.out.println(book3);
		System.out.println(member1);
		System.out.println(member2);
		System.out.println(member3);
		
	}

}

class Book {

	String title;
	int price;
	String publisher;
	int pageNum;

	public Book(String title, int price, String publisher, int pageNum) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.pageNum = pageNum;
	}

	public void showBookInfo() {
		System.out.println(title + " / " + price + " / " + publisher + " / " + pageNum);
	}

}

class Member {

	int memberNum;
	String memberName;
	Book rentalBook;

	public Member(int memberNum, String memberName, Book rentalBook) {
		super();
		this.memberNum = memberNum;
		this.memberName = memberName;
		this.rentalBook = rentalBook;
	}

	public void showMemberInfo() {

		System.out.println(memberNum + " / " + memberName + " / " + rentalBook);
	}
}