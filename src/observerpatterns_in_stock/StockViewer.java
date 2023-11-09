package observerpatterns_in_stock;

import java.util.Map;
import java.util.Map.Entry;

/**
 *
 * @author ESAYAS GO.
 *
 */
public class StockViewer implements Observer {

	StockViewer(Subject stockViewer){
		stockViewer.register(this);
	}

	@Override
	public void update(Map<String, Double> stocklist) {
		System.out.println("StockViewer: stocklist is changed:");
		for (Entry<String, Double> entry : stocklist.entrySet()) {
			String key = entry.getKey();
			Double value = entry.getValue();
			System.out.println("StockViewer" + key + " - $" + value);
		}
	}
}