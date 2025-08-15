import java.util.Scanner;

public class SumOfDigits {

    private static int number;
    private static int sumOfDigits;

    /**
     * Main fucntion
     */
    public static void main(String[] args)
    {
        getData();
        computeSumOfDigits();
        displayResult();
    }

    /**
     * Display results
     */
    public static void displayResult()
    {
        System.out.println("The sum of digits of " + number + " is " + sumOfDigits);
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
    public static void computeSumOfDigits()
    {
        int localNumber = number;
        sumOfDigits = 0;
        while (localNumber != 0) {
            // retrieve last digit
            int digit = localNumber % 10;
            // add extracted digit to the final sum
            sumOfDigits += digit;
            // remove the last digit
            localNumber /= 10;
        }
    }
}
