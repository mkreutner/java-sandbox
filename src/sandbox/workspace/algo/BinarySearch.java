import java.util.Scanner;

public class BinarySearch 
{
    private static int tableSize;
    private static int[] table;
    private static int searchElement;
    private static int positionElement;

    public static void main(String args[])
    {
        // Retrieve playing data
        getData();

        // Call sorting methode
        binarySearch();

        // Display results
        displayResult();
    }

    /**
     * Display table
     */
    public static void displayResult()
    {
        System.out.println("Table content: ");
        for (int i = 0; i < tableSize; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
        if (positionElement == -1) {
            System.out.println("Element [" + searchElement + "] not found.");
        } else {
            System.out.println("Element [" + searchElement + "] is at [" + positionElement + "] index (table index starts at 0).");
        }
        System.out.println();
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
        System.out.println("Enter table elements (in ascending order): ");
        for (int i = 0; i < tableSize; i++) {
            table[i] = scanner.nextInt();
        }
        System.out.println("Enter element to find: ");
        searchElement = scanner.nextInt();
        scanner.close();
    }

    /**
     * Binary Search implementation
     */
    public static void binarySearch()
    {
        int left = 0;
        int right = tableSize - 1;

        positionElement = -1;

        while (left <= right) {
            int middle = left + (right - left) / 2;
            if (table[middle] == searchElement) {
                positionElement = middle;
                return;
            }
            if (table[middle] < searchElement) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
    }

}
