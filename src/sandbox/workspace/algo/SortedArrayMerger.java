import java.util.Arrays;
import java.util.Scanner;

public class SortedArrayMerger {
    
    private static int table1Size;
    private static int[] table1;
    private static int table2Size;
    private static int[] table2;
    private static int[] mergedTable;

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
        System.out.print("The first table content: ");
        for (int i = 0; i < table1Size; i++) {
            System.out.print(table1[i] + " ");
        }
        System.out.print("\nThe second table content: ");
        for (int i = 0; i < table2Size; i++) {
            System.out.print(table2[i] + " ");
        }
        System.out.print("\nThe merged table content: ");
        for (int i = 0; i < table1Size + table2Size; i++) {
            System.out.print(mergedTable[i] + " ");
        }
        System.out.println();
    }
   
    /**
     * Get data from user and initialize table
     */
    public static void getData() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of elements in first table: ");
        table1Size = scanner.nextInt();
        if (table1Size == 0) {
            scanner.close();
            throw new Exception("Table cannot be empty");
        }
        table1 = new int[table1Size];
        System.out.print("Enter elements of the first table: ");
        for(int i = 0; i < table1Size; i++) {
            table1[i] = scanner.nextInt();
        }
        System.out.print("Enter number of elements in second table: ");
        table2Size = scanner.nextInt();
        if (table2Size == 0) {
            scanner.close();
            throw new Exception("Table cannot be empty");
        }
        table2 = new int[table2Size];
        System.out.print("Enter elements of the second table: ");
        for(int i = 0; i < table2Size; i++) {
            table2[i] = scanner.nextInt();
        }

        scanner.close();
    }

    /**
     * Compute the power of base
     */
    public static void doTheJob()
    {
        // Sort tables if needed
        Arrays.sort(table1);
        Arrays.sort(table2);

        // Do the merge
        mergedTable = new int[table1Size + table2Size];
        int i = 0, j = 0, k = 0;
        while ((i < table1Size) && (i < table2Size)) {
            mergedTable[k++] = (table1[i] < table2[j]) ? table1[i++] : table2[j++];
        }
        while (i < table1Size) {
            mergedTable[k++] = table1[i++];
        }
        while (j < table2Size) {
            mergedTable[k++] = table2[j++];
        }
    }
}
