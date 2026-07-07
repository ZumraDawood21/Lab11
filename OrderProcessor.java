class OrderProcessor {

    // Step 2 — Constants replacing magic numbers
    private static final double TAX_RATE    = 0.15;
    private static final int    MINIMUM_AGE = 18;

    // Seams — injected dependencies
    private final InvoicePrinter      invoicePrinter;
    private final DiscountCalculator  discountCalculator;

    public OrderProcessor(InvoicePrinter invoicePrinter,
                          DiscountCalculator discountCalculator) {
        this.invoicePrinter     = invoicePrinter;
        this.discountCalculator = discountCalculator;
    }

    // -------------------------------------------------------------------------
    // Main entry point — Step 3 (Extract Method applied here)
    // -------------------------------------------------------------------------
    public void process(Order order) {
        printCustomerInfo(order.getCustomer());

        double subtotal   = calculateSubtotal(order.getProducts());
        double discount   = discountCalculator.calculate(subtotal);   // Task 2
        double tax        = calculateTax(subtotal - discount);
        double grandTotal = (subtotal - discount) + tax;

        invoicePrinter.print(order.getProducts(), subtotal, discount, tax, grandTotal);

        validateCustomerAge(order.getCustomer());
        checkPremiumEligibility(order.getCustomer());                 // Task 3
        updateOrderStatus(order, grandTotal);
        printLoyaltyPoints(grandTotal);                               // Step 6
    }

    // -------------------------------------------------------------------------
    // Extracted private methods (Step 3 — Extract Method)
    // -------------------------------------------------------------------------

    private void printCustomerInfo(Customer customer) {
        System.out.println("Customer: " + customer.getName());
        System.out.println("Email:    " + customer.getEmail());
        System.out.println("Age:      " + customer.getAge());
    }

    private double calculateSubtotal(java.util.List<Product> products) {
        double subtotal = 0;
        for (Product product : products) {
            subtotal += product.getPrice() * product.getQuantity();
        }
        return subtotal;
    }

    private double calculateTax(double amountAfterDiscount) {
        return amountAfterDiscount * TAX_RATE;
    }

    private void validateCustomerAge(Customer customer) {
        if (customer.getAge() < MINIMUM_AGE) {
            System.out.println("WARNING: Customer is under 18.");
        }
    }

    // Task 3 — calls the sprouted method on Customer
    private void checkPremiumEligibility(Customer customer) {
        if (customer.isEligibleForPremium()) {
            System.out.println("Premium Customer");
        }
    }

    private void updateOrderStatus(Order order, double grandTotal) {
        order.setStatus(grandTotal > 0 ? "PROCESSED" : "FAILED");
        System.out.println("Order Status: " + order.getStatus());
    }

    // Step 6 — Sprout Method: new feature added without touching process() logic
    private void printLoyaltyPoints(double grandTotal) {
        int points = (int)(grandTotal / 10);
        System.out.println("Loyalty Points Earned: " + points);
    }
}
