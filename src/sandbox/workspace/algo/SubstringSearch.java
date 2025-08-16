import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class SubstringSearch {
            
    private static String mainString;
    private static String subString;
    private static ArrayList<Integer> positions = new ArrayList<Integer>();

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
        System.out.println("Main string: " + mainString);
        System.out.print("           : ");
        int previous = 0;
        for (Integer p : positions) {
            System.out.print(" ".repeat(p.intValue() - previous) + "^");
            previous = p.intValue() + 1;
        }
        System.out.println();
        System.out.println("Sub string : " + subString);
        if (positions.size() != 0) {
            System.out.print("Positions  : ");
            for (Integer p : positions) {
                System.out.print(p.intValue() + " ");
            }
        } else {
            System.out.print("No occurences found");
        }
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter main string: ");
        mainString = scanner.nextLine();
        System.out.print("Enter sub string to search: ");
        subString = scanner.nextLine();
        scanner.close();
    }

    /**
     * Compute the power of base
     * 0                  19                                              67
     * le petit louis est le petit fils du vieux louis est il habite dans le bourg du haut village
     */
    public static void doTheJob()
    {
        int lastIndex = 0;
        while (lastIndex != -1) {
            lastIndex = mainString.indexOf(subString, lastIndex);
            if (lastIndex != -1) {
                positions.add(lastIndex);
                lastIndex++;
            }
        }
    }
}
