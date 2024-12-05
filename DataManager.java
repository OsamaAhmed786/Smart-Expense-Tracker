import java.io.*;
import java.util.ArrayList;

public abstract class DataManager {
    public static void saveData(String fileName, ArrayList<Expense> expenses) throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
        oos.writeObject(expenses);
        oos.close();
        System.out.println("Data saved successfully!");
    }

    public static ArrayList<Expense> loadData(String fileName) throws IOException, ClassNotFoundException {
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));
        ArrayList<Expense> expenses = (ArrayList<Expense>) ois.readObject();
        ois.close();
        System.out.println("Data loaded successfully!");
        return expenses;
    }
}
