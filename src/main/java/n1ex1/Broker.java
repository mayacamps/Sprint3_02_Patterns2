package n1ex1;

import java.beans.PropertyChangeSupport;

public class Broker {
    private float stock;
    private PropertyChangeSupport support;

    public Broker(){
        support = new PropertyChangeSupport(this);
    }

    public void addStockAgency(StockAgency stockAgency){
        support.addPropertyChangeListener(stockAgency);
    }

    public void removeStockAgency(StockAgency stockAgency){
        support.removePropertyChangeListener(stockAgency);
    }

    public void setStock(float stockValue){
        support.firePropertyChange("stock", this.stock, stockValue);
        this.stock = stockValue;
    }
}
