class DiscountCalculator {

    private static final double HIGH_DISCOUNT_THRESHOLD = 500.0;
    private static final double LOW_DISCOUNT_THRESHOLD  = 200.0;
    private static final double HIGH_DISCOUNT_RATE      = 0.10;
    private static final double LOW_DISCOUNT_RATE       = 0.05;

    public double calculate(double subtotal) {
        if (subtotal > HIGH_DISCOUNT_THRESHOLD) {
            return subtotal * HIGH_DISCOUNT_RATE;
        } else if (subtotal > LOW_DISCOUNT_THRESHOLD) {
            return subtotal * LOW_DISCOUNT_RATE;
        }
        return 0;
    }
}
