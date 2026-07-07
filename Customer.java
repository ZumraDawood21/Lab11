class Customer {

    private String name;
    private String address;
    private String email;
    private int    age;

    public Customer(String name, String address, String email, int age) {
        this.name    = name;
        this.address = address;
        this.email   = email;
        this.age     = age;
    }

    // Getters
    public String getName()    { return name; }
    public String getAddress() { return address; }
    public String getEmail()   { return email; }
    public int    getAge()     { return age; }

    // Task 3 — Sprout Method
    // Returns true if customer is 21 years or older (eligible for premium).
    public boolean isEligibleForPremium() {
        return age >= 21;
    }
}