package LibraryCataloge;

public class Book {

	// properties
	String title;
	int pageCount;
	int isbn;
	boolean isCheckedOut;// whether or not the book is checked out
	int dayCheckedOut = -1;// initially not checked out

	// Constructor
	Book(String bookTitle, int pageCount, int bookISBN) {
		this.title = bookTitle;
		this.pageCount = pageCount;
		this.isbn = bookISBN;
		this.isCheckedOut = false;

	}

	
	//getter and Setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}

	public boolean isCheckedOut() {
		return isCheckedOut;
	}

	public void setCheckedOut(boolean isCheckedOut,int dayCheckedOut) {
		this.isCheckedOut = isCheckedOut;
		this.setDayCheckedOut(dayCheckedOut);
	}

	public int getDayCheckedOut() {
		return dayCheckedOut;
	}

	private void setDayCheckedOut(int dayCheckedOut) {
		this.dayCheckedOut = dayCheckedOut;
	}

}
