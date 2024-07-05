package constructor.quiz;

public class Quiz01 {

	public static void main(String[] args) {

		Book book1 = new Book();
		Book book2 = new Book("자바프로그래밍", 10000, "금빛출판사", 300);

		book1.title = "스프링부트";
		book1.price = 30000;
		book1.publisher = "한빛출판사";
		book1.pageNum = 200;
		
		book1.showBookInfo();
		System.out.println(book1);
		System.out.println();
		book2.showBookInfo();
		System.out.println(book2);
		System.out.println();
	}

}

class Book {

	String title;
	int price;
	String publisher;
	int pageNum;

	Book() {
	}

	public Book(String title, int price, String publisher, int pageNum) {
		super();
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.pageNum = pageNum;
	};

	public void showBookInfo() {
		System.out.println(title + " / " + price + " / " + publisher + " / " + pageNum);
	}

}