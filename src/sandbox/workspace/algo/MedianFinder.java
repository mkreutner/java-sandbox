import java.util.Arrays;
import java.util.Scanner;

public class MedianFinder {
    
    private static int tableSize;
    private static int[] table;
    private static double median;

    /**
     * Main fucntion
     */
    public static void main(String[] args)
    {
        try {
            getData();
            doTheJob();
            displayResult();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    /**
     * Display results
     */
    public static void displayResult()
    {
        System.out.println("The table content: ");
        for (int i = 0; i < tableSize; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println("The median of values is: " + median);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements: ");
        tableSize = scanner.nextInt();
        if (tableSize == 0) {
            scanner.close();
            throw new Exception("Table cannot be empty");
        }
        table = new int[tableSize];
        System.out.print("Enter elements of the table: ");
        for(int i = 0; i < tableSize; i++) {
            table[i] = scanner.nextInt();
        }
        scanner.close();
    }

    /**
     * Compute the power of base
     */
    public static void doTheJob()
    {
        // Sort the table
        Arrays.sort(table);

        if (tableSize % 2 == 0) {
            // If table had even number of elements,
            // median is equal of mean of the two central element
            median = ( table[ tableSize / 2 - 1 ] + table[ tableSize / 2 ] ) / 2;
        } else {
            // If table had odd number of elements,
            // median is equal at the central element
            median = table[ tableSize / 2 ];
        }
    }
}
