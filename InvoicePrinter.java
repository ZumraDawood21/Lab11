class InvoicePrinter {

    public void print(java.util.List<Product> products,
                      double subtotal,
                      double discount,
                      double tax,
                      double grandTotal) {

        System.out.println("---- INVOICE ----");
        System.out.println("Items:");

        for (Product product : products) {
            System.out.println(
                product.getName()
                + " x" + product.getQuantity()
                + " @ " + product.getPrice()
            );
        }

        System.out.println("Subtotal:    " + subtotal);
        System.out.println("Discount:    " + discount);
        System.out.println("Tax (15%):   " + tax);
        System.out.println("Grand Total: " + grandTotal);
    }
}