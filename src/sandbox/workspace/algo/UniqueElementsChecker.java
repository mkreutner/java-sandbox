import java.util.HashSet;
import java.util.Scanner;

public class UniqueElementsChecker {
    
    private static int tableSize;
    private static int[] table;
    private static boolean hasDuplicates;

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
        if (hasDuplicates) {
            System.out.println("Table contains duplicates!");
        } else {
            System.out.println("\\o/ Table is clean, it duplicates-free!");
        }
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
     * Check if at least one duplicate exists in table
     */
    public static void doTheJob()
    {
        HashSet<Integer> set = new HashSet<Integer>();
        hasDuplicates = false; 
        for(int elem : table) {
            if (!set.add(elem)) {
                // if element cannot be added in set 
                // because value already exists in set; it's a duplicate
                hasDuplicates = true;
                return;
            }
        }
    }
}
