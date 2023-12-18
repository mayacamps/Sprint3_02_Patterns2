package n1ex1;

public class Main {
    public static void main(String[] args) {
        Broker broker = new Broker();
        StockAgency stockAgency1 = new StockAgency();
        StockAgency stockAgency2 = new StockAgency();
        StockAgency stockAgency3 = new StockAgency();

        broker.addStockAgency(stockAgency1);

        System.out.println("First change in stock...");
        broker.setStock(4.5f);
        System.out.println("Stock agency 1: " + stockAgency1.getStock());

        broker.addStockAgency(stockAgency2);

        System.out.println("Second change in stock...");
        broker.setStock(3);
        System.out.println("Stock agency 1: " + stockAgency1.getStock());
        System.out.println("Stock agency 2: " + stockAgency2.getStock());
        System.out.println("Stock agency 3: " + stockAgency3.getStock());
    }
}
