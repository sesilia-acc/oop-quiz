package id.ac.polinema.oop;

public class Cashier {
    public double calculateChange(Order order, double cash) {
        double total = order.getFinalTotal();
        return cash - total;
    }
}
