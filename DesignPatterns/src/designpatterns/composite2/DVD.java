package designpatterns.composite2;
/**
 * 
 * @author ESAYAS GO.
 *
 */
public class DVD implements CatalogItem {
	private String title;
	
	public DVD(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public void print() {
		System.out.println("\tDVD title: " + title);
	}
}
