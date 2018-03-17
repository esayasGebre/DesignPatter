package designpattern.observer.stock;

import java.util.HashMap;
import java.util.Map;
/**
 * 
 * @author ESAYAS GO.
 *
 */
public abstract class AbstractMarket {
	Map<String, Double> stocklist = new HashMap<String, Double>();

	public Map<String, Double> getStocklist() {
		return stocklist;
	}
}