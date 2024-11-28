package taxation;

public class Tax {
    private double amount;

    public Tax(double amount) {
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    public void updateAmount(double amount) {
        this.amount = amount;
    }
}
