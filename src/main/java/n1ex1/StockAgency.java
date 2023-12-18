package n1ex1;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class StockAgency implements PropertyChangeListener {
    private float stock;
    @Override
    public void propertyChange(PropertyChangeEvent evt) {
        this.setStock((float) evt.getNewValue());
    }

    public float getStock() {
        return stock;
    }

    public void setStock(float stock) {
        this.stock = stock;
    }
}
