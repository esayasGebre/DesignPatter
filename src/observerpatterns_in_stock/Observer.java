package observerpatterns_in_stock;

import java.util.Map;
/**
 *
 * @author ESAYAS GO.
 *
 */
public interface Observer {
    public void update(Map<String, Double> stocklist);
}
