/*	Create a class titled SchoolTextBook that contains fields for the author, title, page count, ISBN, and price. This SchoolTextBook 
 * 	class will also provide setter and getter methods for all fields. Save this class in a file titled SchoolTextBook.java.	*/

import java.util.Comparator;

public class SchoolTextBook {

	private String author;
	private String title;
	private int pageCount;
	private String ISBN;
	private double price;

	// defines SchoolTextBook constructor that takes 5 variables
	public SchoolTextBook(String author, String title, int pageCount, String ISBN, double price) {
		setAuthor(author);
		setTitle(title);
		setPageCount(pageCount);
		setISBN(ISBN);
		setPrice(price);
	}

	// set methods for all 5 variables
	public void setAuthor(String author) {
		this.author = author;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;

	}

	public void setISBN(String ISBN) {
		this.ISBN = ISBN;

	}

	public void setPrice(double price) {
		this.price = price;

	}

	// get methods for all 5 variables
	public String getAuthor() {
		return author;
	}

	public String getTitle() {
		return title;
	}

	public int getPageCount() {
		return pageCount;
	}

	public String getISBN() {
		return ISBN;
	}

	public double getPrice() {
		return price;
	}

	// comparator methods for all 5 variables
	public static Comparator<SchoolTextBook> BookAuthorComparator = new Comparator<SchoolTextBook>() {

		public int compare(SchoolTextBook book1, SchoolTextBook book2) {

			String bookName1 = book1.getAuthor().toUpperCase();
			String bookName2 = book2.getAuthor().toUpperCase();

			// ascending order
			return bookName1.compareTo(bookName2);

		}

	};

	public static Comparator<SchoolTextBook> BookTitleComparator = new Comparator<SchoolTextBook>() {

		public int compare(SchoolTextBook book1, SchoolTextBook book2) {

			String bookName1 = book1.getTitle().toUpperCase();
			String bookName2 = book2.getTitle().toUpperCase();

			// ascending order
			return bookName1.compareTo(bookName2);

		}

	};
	
	public static Comparator<SchoolTextBook> BookPageCountComparator = new Comparator<SchoolTextBook>() {

		public int compare(SchoolTextBook book1, SchoolTextBook book2) {

			int bookName1 = book1.getPageCount();
			int bookName2 = book2.getPageCount();

			// ascending order
			return Integer.compare(bookName1, bookName2);

		}

	};
	
	public static Comparator<SchoolTextBook> BookISBNComparator = new Comparator<SchoolTextBook>() {

		public int compare(SchoolTextBook book1, SchoolTextBook book2) {

			String bookName1 = book1.getISBN().toUpperCase();
			String bookName2 = book2.getISBN().toUpperCase();

			// ascending order
			return bookName1.compareTo(bookName2);

		}

	};
	
	public static Comparator<SchoolTextBook> BookPriceComparator = new Comparator<SchoolTextBook>() {

		public int compare(SchoolTextBook book1, SchoolTextBook book2) {

			double bookName1 = book1.getPrice();
			double bookName2 = book2.getPrice();

			// ascending order
			return Double.compare(bookName1, bookName2);

		}

	};
	
}
