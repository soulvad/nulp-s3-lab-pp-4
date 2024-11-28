package taxation;

public class Income {
    private String incomeName;
    private double amount;
    private double taxRate;

    public Income(String incomeName, double amount, double taxRate) {
        this.incomeName = incomeName;
        this.amount = amount;
        this.taxRate = taxRate;
    }

    public String getIncomeName() {
        return incomeName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public double getTaxRate() {
        return taxRate;
    }
}
