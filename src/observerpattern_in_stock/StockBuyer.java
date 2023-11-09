package observerpattern_in_stock;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author ESAYAS GO.
 *
 */
public class StockBuyer implements Observer {

	   StockBuyer(Subject stockBuyer){
	       	stockBuyer.register(this);
	    }

	@Override
	public void update(Map<String, Double> stocklist) {
		System.out.println("StockBuyer: stocklist is changed:");
		for (Entry<String, Double> entry : stocklist.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			System.out.println(key + " - $" + value);
		}
	}
}