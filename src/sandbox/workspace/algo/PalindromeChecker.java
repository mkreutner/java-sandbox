import java.util.Scanner;

public class PalindromeChecker {
    
    private static String inMsg;

    /**
     * Main fucntion
     */
    public static void main(String[] args)
    {
        getData();
        displayResult();
    }

    /**
     * Display results
     */
    public static void displayResult()
    {
        if (isPalindrome()) {
            System.out.println("[OK] - The string is a palindrome.");
        } else {
            System.out.println("[KO] - The string is not a palindrome.");
        }
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
    public static boolean isPalindrome()
    {
        // Delete all punctuation, case, space
        String tmp = inMsg.replace("[^a-zA-Z0-9]", "").toLowerCase();
        int left = 0;
        int right = inMsg.length() - 1;

        while (left < right) {
            if (tmp.charAt(left) != tmp.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
