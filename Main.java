import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BudgetManager budgetManager = new BudgetManager(5000); // Default budget

        while (true) {
            System.out.println("\nSmart Expense Tracker");
            System.out.println("1. Set Monthly Budget");
            System.out.println("2. Add Expense");
            System.out.println("3. Check Budget Status");
            System.out.println("4. View All Expenses");
            System.out.println("5. Save Expenses to File");
            System.out.println("6. Load Expenses from File");
            System.out.println("7. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter new monthly budget: ");
                        double budget = scanner.nextDouble();
                        budgetManager = new BudgetManager(budget);
                        System.out.println("Budget updated successfully!");
                        break;

                    case 2:
                        System.out.print("Enter category: ");
                        String category = scanner.nextLine();
                        System.out.print("Enter amount: ");
                        double amount = scanner.nextDouble();
                        scanner.nextLine(); // Consume newline
                        System.out.print("Enter date (YYYY-MM-DD): ");
                        String date = scanner.nextLine();
                        budgetManager.addExpense(new Expense(category, amount, date));
                        break;

                    case 3:
                        budgetManager.checkBudgetStatus();
                        break;

                    case 4:
                        budgetManager.displayExpenses();
                        break;

                    case 5:
                        DataManager.saveData("expenses.dat", budgetManager.getExpenses());
                        break;

                    case 6:
                        budgetManager = new BudgetManager(5000);
                        budgetManager.loadData("expenses.dat");
                        break;

                    case 7:
                        System.out.println("Exiting... Goodbye!");
                        scanner.close();
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
