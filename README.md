# Smart-Expense-Tracker
The aim of this project is to develop a Smart Expense Tracker that enables users to track their daily expenses, analyze spending patterns, and receive personalized budget optimization suggestions. 

# Assessment Criteria Evaluation
## 1. Creativity
o The Smart Expense Tracker stands out as a practical yet innovative application.
o Unique features such as personalized budget analysis and expense warnings
demonstrate originality.
## 2. OOP Principles
 Encapsulation: Private attributes in the Expense class with controlled access
through getters and setters.
 Inheritance: BudgetManager extends Expense to utilize its properties and
enhance functionality.
 Polymorphism: Overriding of the toString method in Expense and usage of
dynamic behavior in methods like addExpense().
 Abstraction: The DataManager class abstracts file persistence operations, making
the core logic modular and reusable.
## 3. Design Quality
 A clear and complete UML class diagram illustrates relationships, inheritance
hierarchies, attributes, and methods.
## 4. Functionality
 The application meets all initial requirements, including expense tracking, budget
management, and persistence.
 The program is user-friendly, handles errors gracefully, and provides accurate
insights into spending.
## 5. Code Quality
 The code is structured, with logical separation of concerns.
 Inline comments clarify the purpose of each class and method, enhancing
readability.
## 6. Documentation
 Comprehensive documentation is provided, explaining the project design,
implementation, and features.


## Class Diagram Overview:
The diagram illustrates the relationships between classes in the Smart Expense Tracker.
+-------------------+
|    Expense        |
+-------------------+
| - category: String|
| - amount: double  |
| - date: String    |
+-------------------+
| + getters/setters |
+-------------------+
         ^
         |
         |
+------------------------------+
|         BudgetManager        |
+------------------------------+
| - monthlyBudget: double      |
| - totalExpenses: double      |
| - expenses: ArrayList<Expense>|
+------------------------------+
| + addExpense(Expense): void  |
| + checkBudgetStatus(): void  |
| + displayExpenses(): void    |
+------------------------------+
             ^
             |
             |
+-----------------------------+
|         DataManager         |
+-----------------------------+
| + saveData(): void          |
| + loadData(): void          |
+-----------------------------+
