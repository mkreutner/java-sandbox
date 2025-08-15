import java.util.Scanner;

public class VowelCounter {
        
    private static String inMsg;
    private static int vowelsCount;

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
        System.out.println("The message is        : " + inMsg);
        System.out.println("The number of vowel is: " + vowelsCount);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        inMsg = scanner.nextLine();
        scanner.close();
    }

    /**
     * Compute the power of base
     */
    public static void doTheJob()
    {
        vowelsCount = 0;
        String str = inMsg.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (currentChar == 'a' 
                || currentChar == 'e'
                || currentChar == 'i'
                || currentChar == 'o'
                || currentChar == 'u'
                || currentChar == 'y') {
                vowelsCount++;
            }
        }
    }
}
