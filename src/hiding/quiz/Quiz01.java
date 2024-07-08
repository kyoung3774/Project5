package hiding.quiz;

public class Quiz01 {

	public static void main(String[] args) {
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book("응랑",11111,"눈자",400);
		
		book1.setTitel("자바프로그래밍");
		book1.setPrice(20000);
		book1.setPublisher("한빛컴퍼니");
		book1.setPageNum(300);
		
		book2.setTitel("스프링");
		book2.setPrice(15000);
		book2.setPublisher("한빛컴퍼니");
		book2.setPageNum(500);
	}

}

class Book {
	private String titel;
	private int price;
	private String publisher;
	private int pageNum;
	
	public Book() {};
	
	
	public Book(String titel, int price, String publisher, int pageNum) {
		super();
		this.titel = titel;
		this.price = price;
		this.publisher = publisher;
		this.pageNum = pageNum;
	}


	// title
	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}
	
	//price
	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	//publisher
	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	//pageNum
	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

}