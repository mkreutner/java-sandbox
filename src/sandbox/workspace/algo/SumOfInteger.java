import java.util.Scanner;

public class SumOfInteger 
{
    private static int tableSize;
    private static int[] table;
    private static int sumTotal;    

    public static void main(String args[])
    {
        // Retrieve playing data
        getData();

        // Call search methode
        sumOfInteger();

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
        System.out.println("Sum of Integers is [" + sumTotal + "].");
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
        scanner.close();
    }

    /**
     * Sum of Integers implementation
     */
    public static void sumOfInteger()
    {
        sumTotal = 0;
        for (int i = 0; i < tableSize; i++) {
            sumTotal += table[i];
        }
    }
}
