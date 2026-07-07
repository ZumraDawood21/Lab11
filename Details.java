
public class Main {

    public static void main(String[] args) {

        // Build customer
        Customer customer = new Customer(
            "Ali Hassan", "Gujranwala", "ali@email.com", 22
        );

        // Build product list
        java.util.List<Product> products = new java.util.ArrayList<>();
        products.add(new Product("Laptop",   350.0, 1));
        products.add(new Product("Mouse",     25.0, 2));
        products.add(new Product("Keyboard",  45.0, 1));

        // Build order
        Order order = new Order(customer, products);

        // Wire up dependencies (Seams)
        InvoicePrinter     printer    = new InvoicePrinter();
        DiscountCalculator calculator = new DiscountCalculator();
        OrderProcessor     processor  = new OrderProcessor(printer, calculator);

        // Process
        processor.process(order);
    }
}
