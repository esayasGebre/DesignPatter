package designpattern.observer.stock;

import java.util.Iterator;
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
		Iterator<Entry<String, Double>> iter = stocklist.entrySet().iterator();
		while (iter.hasNext()) {
			@SuppressWarnings({ "unchecked", "rawtypes" })
			Map.Entry<String, Double> entry = (Map.Entry) iter.next();
			String key = (String) entry.getKey();
			Double value = (Double) entry.getValue();
			System.out.println("StockViewer" + key + " - $" + value);
		}
	}
}