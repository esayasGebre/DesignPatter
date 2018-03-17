package designpatterns.composite2;

/**
 * 
 * @author ESAYAS GO.
 *
 */
public class Book implements CatalogItem{
	private String isbn;
	private String title;

	public Book(String isbn, String title) {
		this.isbn = isbn;
		this.title = title;
	}
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public void print(){
		System.out.println("\tBook isbn: " + isbn + " and title: " + title);
	}

}
