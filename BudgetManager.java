import java.util.ArrayList;

public class BudgetManager extends Expense {
    private double monthlyBudget;
    private double totalExpenses;
    private ArrayList<Expense> expenses;

    public BudgetManager(double monthlyBudget) {
        super("", 0, "");
        this.monthlyBudget = monthlyBudget;
        this.totalExpenses = 0;
        this.expenses = new ArrayList<>();
    }

    // Add Expense
    public void addExpense(Expense expense) {
        expenses.add(expense);
        totalExpenses += expense.getAmount();
        System.out.println("Expense added successfully!");
    }

    // Check Budget Status
    public void checkBudgetStatus() {
        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Remaining Budget: " + (monthlyBudget - totalExpenses));
        if (totalExpenses > monthlyBudget) {
            System.out.println("WARNING: You have exceeded your budget!");
        }
    }

    // Display All Expenses
    public void displayExpenses() {
        System.out.println("All Expenses:");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
    }
}
