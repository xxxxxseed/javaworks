package object;

public class Book {
	//필드
	int bookNumber;		//책 번호
	String bookTitle;	//책 제목
	
	//생성자
	Book(int bookNumber, String bookTitle){
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return bookNumber + ", " + bookTitle;
	}

	
	@Override
	public int hashCode() {
		return bookNumber;
	}

	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Book) {
			Book book = (Book)obj; //강제 형변환
			if(this.bookNumber == book.bookNumber) {
				return true;
			}
		}
		return false; //bookNumber가 일치하지 않으면
	}
	
	
	
}
