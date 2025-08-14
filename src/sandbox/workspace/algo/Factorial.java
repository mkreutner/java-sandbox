import java.util.Scanner;

public class Factorial 
{
    public static void main(String[] args)
    {
        // Retrieve data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positif integer number: ");
        int n = scanner.nextInt();
        scanner.close();
        if (n < 0) {
            System.out.println("Factorial is only define for positif integer number.");
        } else {
            long result = computeFactorial(n);
            System.out.println("Factorial of [" + n + "] is [" + result + "].");
        }
    }

    /**
     * Compute factorial using a for loop.
     */
    public static long computeFactorial(int n)
    {
        if (n == 0 || n == 1) {
            return 1;
        }
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
