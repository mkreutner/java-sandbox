import java.util.Scanner;

public class BubbleSort 
{

    public static void main(String[] args)
    {
        // Data 
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter table size:");
        int n = scanner.nextInt();
        int[] table = new int[n];
        System.out.println("Enter table elements:");
        for (int i = 0; i < n; i++) {
            table[i] = scanner.nextInt();
        }
        scanner.close();

        // Bubble sorting implementation
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (table[j] > table[j + 1]) {
                    int temp = table[j];
                    table[j] = table[j + 1];
                    table[j + 1] = temp;
                }
            }
        }

        // Display sorted table
        System.out.println("Sorted table:");
        for (int i = 0; i < n; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }
}