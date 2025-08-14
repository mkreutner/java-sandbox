import java.util.Scanner;

public class InsertionSort {

    private static int tableSize;
    private static int[] table;

    public static void main(String args[])
    {
        // Retrieve playing data
        getData();

        // Call sorting methode
        insertionSort();

        // Display results
        displayTable();
    }

    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter table size: ");
        tableSize = scanner.nextInt();
        table = new int[tableSize];
        System.out.println("Enter table elements: ");
        for (int i = 0; i < tableSize; i++) {
            table[i] = scanner.nextInt();
        }
        scanner.close();
    }

    /**
     * Display table
     */
    public static void displayTable()
    {
        System.out.println("Table content: ");
        for (int i = 0; i < tableSize; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

    public static void insertionSort()
    {
        for (int i = 1; i < tableSize; i++) {
            int key = table[i];
            int j = i - 1;
            while (j >= 0 && table[j] > key) {
                table[j + 1] = table[j];
                j--;
            }
            table[j + 1] = key;
        }
    }
}
