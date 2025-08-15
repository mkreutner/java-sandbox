import java.util.Scanner;


public class PowerCalculation 
{

    private static int base;
    private static int exponent;
    private static Double calculatedPower;

    /**
     * Main fucntion
     */
    public static void main(String[] args)
    {
        getData();
        powerCalculation();
        displayResult();
    }

    /**
     * Display results
     */
    public static void displayResult()
    {
        System.out.println(base + " to the power of " + exponent + " is " + calculatedPower);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter base (int)    : ");
        base = scanner.nextInt();
        System.out.print("Enter exponent (int): ");
        exponent = scanner.nextInt();
        scanner.close();
    }

    /**
     * Compute the power of base
     */
    public static void powerCalculation()
    {
        if (exponent == 0) {
            /* exponent is 0 */
            calculatedPower = 1.0;
        } else if (exponent > 0) {
            /* exponent is positive */
            calculatedPower = base == 0 ? 0.0 : base;
            for (int i = 1; i < exponent; i++) {
                calculatedPower *= base; 
            }
        } else {
            /* exponent is negative */
            calculatedPower = base == 0 ? -1 * Double.POSITIVE_INFINITY : base;
            for (int i = 1; i < -exponent; i++) {
                calculatedPower /= base; 
            }
        }
    }
}
