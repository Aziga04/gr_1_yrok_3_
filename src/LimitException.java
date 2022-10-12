public class LimitException extends Exception {
    private int remainingAmount;

    public double getRemainingAmount() {
        return remainingAmount;
    }

    public LimitException(String message, int remainingAmount) {
        super(message);
        this.remainingAmount = remainingAmount;
    }

}
