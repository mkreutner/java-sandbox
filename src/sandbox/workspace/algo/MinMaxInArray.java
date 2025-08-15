import java.util.Scanner;

public class MinMaxInArray {

    private static boolean searchMax = false;        
    private static int tableSize;
    private static int[] table;
    private static int extremum;

    /**
     * Main fucntion
     */
    public static void main(String[] args)
    {
        getData();
        doTheJob();
        displayResult();
    }

    /**
     * Display results
     */
    public static void displayResult()
    {
        System.out.println("The " + (searchMax ? "Maximun":"Minimum")  + " number in the table is " + extremum);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Do you want to search for the minimum or the maximum? [MIN/max]: ");
        String answer = scanner.nextLine().toLowerCase();
        switch (answer) {
            case "max":
                searchMax = true;
                break;
            case "min":
            default:
                searchMax = false;
                break;
        }

        System.out.print("Enter size of table: ");
        tableSize = scanner.nextInt();
        table = new int[tableSize];
        System.out.println("Enter elements of table: ");
        for (int i = 0; i < tableSize; i++) {
            table[i] = scanner.nextInt();
        }

        scanner.close();
    }

    /**
     * Compute the power of base
     */
    public static void doTheJob()
    {
        extremum = table[0];
        for (int i = 0; i < tableSize; i++) {
            if ((searchMax == false && table[i] < extremum)
                || (searchMax == true && table[i] > extremum)) {
                    extremum = table[i];
            }
        }
    } 

}
