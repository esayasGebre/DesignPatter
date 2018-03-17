package designpatterns.composite2;

/**
 * 
 * @author ESAYAS GO.
 *
 */
public class Application {

	public static void main(String [] args){
		Category fictionCategory=new Category("FictionCategory");
		Category compBookCategory=new Category("OOP");
		Category actionCategory=new Category("Action");		
				
		Book fic1=new Book("1008899", "mekelle 1999");
		Book fic2=new Book("2005674", "new city");
		
		Book com1=new Book("1001234", "design pattern");
		Book com2=new Book("2001014", "com architecture one");
		Book com3=new Book("1001010", "soft software");
		
		DVD m1=new DVD("cold blood");
		DVD m2=new DVD("at 2078");
		
		fictionCategory.addItem(fic1);
		fictionCategory.addItem(fic2);
		
		compBookCategory.addItem(com1);
		compBookCategory.addItem(com2);
		compBookCategory.addItem(com3);
		
		actionCategory.addItem(m1);
		actionCategory.addItem(m2);
		
		fictionCategory.print();
		compBookCategory.print();
		actionCategory.print();
		
		
	}
}
