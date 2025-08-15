import java.util.Scanner;

public class ReverseString {
    
    private static String inMsg;
    private static String outMsg;

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
        System.out.println("The original message is : " + inMsg);
        System.out.println("The reversed message is : " + outMsg);
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a message: ");
        inMsg = scanner.nextLine().toLowerCase();
        scanner.close();
    }

    /**
     * Compute the power of base
     */
    public static void doTheJob()
    {
        char[] inMsgChrArr = inMsg.toCharArray();
        int left = 0;
        int right = inMsg.length() - 1;

        while (left < right) {
            char tmp = inMsgChrArr[left];
            inMsgChrArr[left] = inMsgChrArr[right];
            inMsgChrArr[right] = tmp;
            left++;
            right--;
        }

        outMsg = new String(inMsgChrArr);
    }
}
