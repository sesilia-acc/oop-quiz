package id.ac.polinema.oop;

/**
 * Manual playground — NOT graded.
 *
 * After you complete the skeleton classes and create OrderItem, Order,
 * and Cashier, write your demo scenario here (see "Try the App Manually"
 * in the README) and run:
 *
 *   mvn -q compile exec:java
 */
public class Main {

    public static void main(String[] args) {
        Menu menu = new Menu(10);
        menu.addMenuItem(new MenuItem("Nasi Goreng", 15000));
        menu.addMenuItem(new MenuItem("Ayam Geprek", 10000));
        menu.addMenuItem(new MenuItem("Mie Ayam", 12000));
        menu.addMenuItem(new MenuItem("Pop Ice", 5000));
        
        Customer customer = new Customer("C001", "Joko Kendil");
        Order order = new Order(customer);
        order.addItem(menu.findItem("Mie Ayam"), 3);
        order.addItem(menu.findItem("Ayam Geprek"), 10);

        Cashier cashier = new Cashier();
        double cash = 200000;

        System.out.println("Customer    : " + order.getCustomer().getName());
        System.out.println("Total       : " + order.getTotal());
        System.out.println("Payable     : " + order.getFinalTotal());
        System.out.println("Cash        : " + cash);
        System.out.println("Change      : " + cashier.calculateChange(order, cash));
    }
}
