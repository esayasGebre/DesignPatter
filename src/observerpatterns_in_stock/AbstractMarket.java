package observerpatterns_in_stock;

import java.util.HashMap;
import java.util.Map;
/**
 *
 * @author ESAYAS GO.
 *
 */
public abstract class AbstractMarket {
	Map<String, Double> stocklist = new HashMap<>();

	public Map<String, Double> getStocklist() {
		return stocklist;
	}
}