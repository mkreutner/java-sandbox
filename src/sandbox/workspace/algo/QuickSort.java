import java.util.Scanner;

public class QuickSort
{
    public static void main(String[] args)
    {
        // Retrieve palying data
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter table size: ");
        int n = scanner.nextInt();
        int[] table = new int[n];
        System.out.print("Enter table elements: ");
        for (int i = 0; i < n; i++) {
            table[i] = scanner.nextInt();
        }

        // Call QuickSort methode
        quickSort(table, 0, n-1);

        // Display the result
        System.out.println("Sorted table");
        for (int i = 0; i < n; i++) {
            System.out.print(table[i] + " ");
        }
        System.out.println();
    }

    public static void quickSort(int[] arr, int low, int high)
    {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high)
    {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                int temp = arr[++i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }
}