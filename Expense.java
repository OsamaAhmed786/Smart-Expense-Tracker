import java.io.Serializable;

public class Expense implements Serializable {
    private String category;
    private double amount;
    private String date; // Format: YYYY-MM-DD

    public Expense(String category, double amount, String date) {
        this.category = category;
        this.amount = amount;
        this.date = date;
    }

    // Getters and Setters (Encapsulation)
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Expense [Category=" + category + ", Amount=" + amount + ", Date=" + date + "]";
    }
}
