package observerpattern_in_stock;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author ESAYAS GO.
 *
 */
public class StockMarket extends AbstractMarket implements Subject {

	 private final Object MUTEX = new Object();
	 List<Observer> observers;

	 public StockMarket() {
		 observers = new ArrayList<>();
	}


	public void addStock(String stockSymbol, Double price) {
		stocklist.put(stockSymbol, price);
	}

	public void update(String stockSymbol, Double price) {
		stocklist.put(stockSymbol, price);
		notifyAllObservers();
	}

	@Override
	public void register(Observer observer) {
        synchronized(MUTEX){
            if(!observers.contains(observer)){
                observers.add(observer);
            }
        }
	}

	@Override
	public void unregister(Observer observer) {
        synchronized(MUTEX){
            int i = observers.indexOf(observer);
            if(i >= 0 ){
                observers.remove(i);
            }
        }
	}

	@Override
	public void notifyAllObservers() {
      synchronized(MUTEX){
            int n = observers.size();
            for(int i = 0 ; i < n; i++){
                Observer observer = observers.get(i);
                observer.update(stocklist);
            }
        }
	}
}