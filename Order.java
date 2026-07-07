class Order {

    private Customer      customer;
    private java.util.List<Product> products;
    private String        status;

    public Order(Customer customer, java.util.List<Product> products) {
        this.customer = customer;
        this.products = products;
        this.status   = "PENDING";
    }

    // Getters & setter
    public Customer               getCustomer() { return customer; }
    public java.util.List<Product> getProducts() { return products; }
    public String                 getStatus()   { return status; }
    public void                   setStatus(String status) { this.status = status; }
}
