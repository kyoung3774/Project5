package instance.quiz;

public class Ex03 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book("스프링",15000,"한빛컴퍼니",500);
		
		book1.title ="자바프로그래밍";
		book1.price = 20000;
		book1.publisher = "한빛컴퍼니";
		book1.pageNum = 300;
		
		book1.showBookInfo();
		System.out.println(book1);
		System.out.println();
		book2.showBookInfo();
		System.out.println(book2);
		System.out.println();
	}

}

class Book{
	String title;
	int price;
	String publisher;
	int pageNum;
	
	Book(){};
	
	Book(String title, int price, String publisher, int pageNum){
		this.title = title;
		this.price = price;
		this.publisher = publisher;
		this.pageNum = pageNum;
	};
	public void showBookInfo() {
		System.out.println("제목: " + title +
						   " 가격: " + price +
						   " 출판사: " + publisher + 
						   " 페이지수: " + pageNum);
	}
}
