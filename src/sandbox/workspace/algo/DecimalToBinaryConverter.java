import java.util.Scanner;

public class DecimalToBinaryConverter {
    
    private static int decimalNumber;
    private static String binaryNumber;

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
        System.out.println("The binary value of " + decimalNumber + " is: ");
        System.out.println(binaryNumber);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        decimalNumber = scanner.nextInt();
        scanner.close();
    }

    /**
     * Convert deciaml number to binary 
     */
    public static void doTheJob()
    {
        if (decimalNumber == 0) {
            binaryNumber = "0";
        } else {
            int tmpDec = decimalNumber;
            StringBuilder tmpBin = new StringBuilder();
            while (tmpDec > 0) {
                int remainder = tmpDec % 2;
                tmpBin.insert(0, remainder); // add remainder in the start of the string
                tmpDec /= 2;
            }
            binaryNumber = tmpBin.toString();
        }
    }
}
