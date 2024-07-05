package constructor;

public class Ex03 {

}

class Board {
	
	int no;
	String title;
	String content;
	String writer;
	
	public Board() {
		super();
	}

	public Board(int no) {
		super();
		this.no = no;
	}

	public Board(int no, String title) {
		super();
		this.no = no;
		this.title = title;
	}

	public Board(int no, String title, String content) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
	}

	public Board(int no, String title, String content, String writer) {
		super();
		this.no = no;
		this.title = title;
		this.content = content;
		this.writer = writer;
	}
	
}