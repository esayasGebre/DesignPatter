package observerpattern_in_stock;

/**
 *
 * @author ESAYST GO.
 *
 */
public class Application {
	public static void main(String[] args) {
		StockMarket market = new StockMarket();

	    //Register observers:
	    new StockBuyer(market);
	    new StockViewer(market);

	    //Store stock data:
	    market.addStock("ORC", 12.23);
	    market.addStock("MSC", 45.78);

	    market.addStock("AAC", 00.78);

	    //Changes to stock data:
	    market.update("ORC", 12.34);
	    market.update("MSC", 44.68);

	}
}
