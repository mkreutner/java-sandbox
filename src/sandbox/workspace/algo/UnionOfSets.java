import java.util.HashSet;
import java.util.Scanner;

public class UnionOfSets {
      
    private static HashSet<Integer> set1 = new HashSet<Integer>();
    private static HashSet<Integer> set2 = new HashSet<Integer>();
    private static HashSet<Integer> union = new HashSet<Integer>();

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
        System.out.println("First set is composed as:");
        for (Integer elem : set1) {
            System.out.print(elem.intValue() + " ");
        }
        System.out.println();
        System.out.println("Second set is composed as:");
        for (Integer elem : set2) {
            System.out.print(elem.intValue() + " ");
        }
        System.out.println();
        System.out.println("Intersections:");
        for (Integer elem : union) {
            System.out.print(elem.intValue() + " ");
        }
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData() throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements of first set (empty to stop): ");
        String strValue;
        while (!(strValue = scanner.nextLine()).isEmpty()) {
            set1.add(Integer.parseInt(strValue));
        }
        System.out.print("Enter elements of second set (empty to stop): ");
        while (!(strValue = scanner.nextLine()).isEmpty()) {
            set2.add(Integer.parseInt(strValue));
        }
        scanner.close();
    }

    /**
     * Search intersection
     */
    public static void doTheJob()
    {
        union.addAll(set1);
        union.addAll(set2);
    } 
}
