import java.util.Scanner;

public class CountDigits {
    
    private static int number;
    private static int digitsCounter;

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
        System.out.println("The number of digits of " + number + " is " + digitsCounter);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number (int): ");
        number = scanner.nextInt();
        scanner.close();
    }

    /**
     * Compute the power of base
     */
    public static void doTheJob()
    {
        int localNumber = number;
        digitsCounter = 0;
        while (localNumber != 0) {
            digitsCounter++;
            // remove the last digit
            localNumber /= 10;
        }
    } 
}
