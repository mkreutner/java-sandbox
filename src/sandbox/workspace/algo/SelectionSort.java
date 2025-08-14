import java.util.Scanner;

public class SelectionSort {
    
    public static void main(String[] args)
    {
        // Retrieve playing data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter table size: ");
        int n = scanner.nextInt();
        int[] table = new int[n];
        System.out.println("Enter table elements: ");
        for (int i = 0; i < n; i++) {
            table[i] = scanner.nextInt();
        }
        scanner.close();

        // Call selectionSort methode
        selectionSort(table);

        // Display results
        System.out.println("Sorted table:");
        for (int i = 0; i< n; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

    public static void selectionSort(int[] arr)
    {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}
