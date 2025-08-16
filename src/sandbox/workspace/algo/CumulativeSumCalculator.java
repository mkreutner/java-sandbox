import java.util.Scanner;

public class CumulativeSumCalculator {
        
    private static int tableSize;
    private static int[] table;
    private static int[] cumulativeSum;

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
        System.out.println("The cumulative sum table content: ");
        for (int i = 0; i < tableSize; i++) {
            System.out.print(cumulativeSum[i] + " ");
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
        cumulativeSum = new int[tableSize];
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
        for(int i = 0; i < tableSize; i++) {
            cumulativeSum[i] = (i == 0) ? table[i] : cumulativeSum[i - 1] + table[i];
        }
    }    
}
