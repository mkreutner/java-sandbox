import java.util.Scanner;

public class GCDCalculation {

    private static int firstNumber;
    private static int secondNumber;
    private static int gcd;

    /**
     * Main fucntion
     */
    public static void main(String[] args)
    {
        getData();
        findGCD();
        displayResult();
    }

    /**
     * Display results
     */
    public static void displayResult()
    {
        System.out.println("The GCD of " + firstNumber + " and " + secondNumber + " is " + gcd);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number (int) : ");
        firstNumber = scanner.nextInt();
        System.out.print("Enter second number (int): ");
        secondNumber = scanner.nextInt();
        scanner.close();
    }

    /**
     * Compute the GCD
     */
    public static void findGCD()
    {
        while (secondNumber != 0 ) {
            int temp = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = temp;
        }

        gcd = firstNumber;
    }
}
