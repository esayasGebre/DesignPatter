package designpattern.observer.stock;
/**
 * 
 * @author ESAYAS GO.
 *
 */
public interface Subject {
    public void register(Observer observer);
    public void unregister(Observer observer);
    public void notifyAllObservers();
}
