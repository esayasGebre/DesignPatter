package compositepatterns2;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 
 * @author ESAYAS GO.
 *
 */
public class Category implements CatalogItem{
	private String name;
    private Collection<CatalogItem> catalogItems = new ArrayList<CatalogItem>();
    
	public Category(String name) {
		this.name = name;
	}
	
    public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void addItem(CatalogItem item){
    	catalogItems.add(item);
    }
    
	public void print() {
		System.out.println("Category name: " + name);
		for (CatalogItem item : catalogItems){
			item.print();
		}
	}

}