package observerpatterns_in_stock;
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
