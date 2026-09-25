package id.ac.polinema.oop;

public class Order {
    private Customer customer;
    private OrderItem[] orderItem;
    private int orderCount;

    public Order(Customer customer) {
        this.customer = customer;
        this.orderItem = new OrderItem[10];
        this.orderCount = 0;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void addItem(MenuItem item, int quantity) {
        if (orderCount < orderItem.length) {
            orderItem[orderCount] = new OrderItem(item, quantity);
            orderCount++;
        }
    }

    public int getItemCount() {
        return orderCount;
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < orderCount; i++) {
            total += orderItem[i].getSubtotal();
        }
        return total;
    }

    public double getFinalTotal() {
        double total = getTotal();
        if (total > 100_000) {
            total *= 0.1;
        }
        return total;
    }
}
