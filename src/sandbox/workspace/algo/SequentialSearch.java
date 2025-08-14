import java.util.Scanner;

public class SequentialSearch 
{
    private static int tableSize;
    private static int[] table;
    private static int searchElement;
    private static int positionElement;

    public static void main(String args[])
    {
        // Retrieve playing data
        getData();

        // Call search methode
        sequentialSearch();

        // Display results
        displayResult();
    }

    /**
     * Display results
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
        System.out.println("Enter table elements: ");
        for (int i = 0; i < tableSize; i++) {
            table[i] = scanner.nextInt();
        }
        System.out.println("Enter element to find: ");
        searchElement = scanner.nextInt();
        scanner.close();
    }

    /**
     * Sequential Search implementation
     */
    public static void sequentialSearch()
    {
        positionElement = -1;
        
        for (int i = 0; i < tableSize; i++) {
            if (table[i] == searchElement) {
                positionElement = i;
                return;
            }
        }
    }    
}
