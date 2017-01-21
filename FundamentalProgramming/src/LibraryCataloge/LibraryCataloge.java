package LibraryCataloge;

import java.util.HashMap;
import java.util.Map;

public class LibraryCataloge {

	// properties
	Map<String, Book> bookCollection = new HashMap<String, Book>();
	int currentDay = 0;
	int lengthOfCheckout = 7;
	double initialLateFee = 0.50;
	double feePerLateDay = 1.00;

	public LibraryCataloge(Map<String, Book> bookCollection) {
		this.bookCollection = bookCollection;
	}

	public LibraryCataloge(Map<String, Book> bookCollection, int lengthOfCheckout, double initialLateFee,
			double feePerLateDay) {
		this.bookCollection = bookCollection;
		this.lengthOfCheckout = lengthOfCheckout;
		this.initialLateFee = initialLateFee;
		this.feePerLateDay = feePerLateDay;
	}

	// instance methods
	public void checkOut(String title) {
		Book book = getBook(title);
		if (book.isCheckedOut) {
			sorryBookAlreadyCheckedOut(book);
		} else {
			book.setCheckedOut(true, currentDay);
			System.out.println("You just Checked out : " + book.title + ". It is due on day "
					+ (getCurrentDay() + getLengthOfCheckout() + " ."));
		}
	}

	public void returnBook(String title) {
		Book book = getBook(title);
		int daysLate = currentDay - (book.getDayCheckedOut() + getLengthOfCheckout());
		if (daysLate > 0) {
			System.out.println("You owe library $ " + (initialLateFee + (daysLate * feePerLateDay)));
		} else {
			System.out.println("Book returned , Thank you!");

		}
		book.isCheckedOut = false;
	}

	public void sorryBookAlreadyCheckedOut(Book book) {
		System.out.println("Sorry The book " + book.title + " already checked out. It should be back on day "
				+ (book.getDayCheckedOut() + lengthOfCheckout) + " .");

	}

	// getter
	public Map<String, Book> getBookCollection() {
		return bookCollection;
	}

	public int getCurrentDay() {
		return currentDay;
	}

	public int getLengthOfCheckout() {
		return lengthOfCheckout;
	}

	public Book getBook(String title) {
		return bookCollection.get(title);
	}

	// Setter
	public void setBookCollection(Map<String, Book> bookCollection) {
		this.bookCollection = bookCollection;
	}

	public void setCurrentDay(int currentDay) {
		this.currentDay = currentDay;
	}

	public static void main(String[] args) {
		Map<String, Book> bookCollection = new HashMap<String, Book>();
		Book harry = new Book("Harry Potter", 12, 100);
		bookCollection.put("Harry Potter", harry);
		
		LibraryCataloge lib = new LibraryCataloge(bookCollection);
		lib.checkOut("Harry Potter");
		
		lib.returnBook("Harry Potter");
	}

}
