import java.util.Scanner;

public class PrimeNumbersInRange {

    public static int minRange;
    public static int maxRange;
    public static Array primeNumbers = new Array(1);

    /**
     * Main fucntion
     */
    public static void main(String[] args)
    {
        getData();
        findPrimeNumbers();
        displayResult();
    }

    /**
     * Display results
     */
    public static void displayResult()
    {
        System.out.println("There are " + primeNumbers.length() + ".");
        System.out.println("Prime numbers from " + minRange + " to " + maxRange + " are:");
        primeNumbers.printArray();
        System.out.println();
    }
    
    /**
     * Get data from user and initialize table
     */
    public static void getData()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter minimal value of range (int): ");
        minRange = scanner.nextInt();
        // 2 is the first prime number
        minRange = minRange < 2 ? 2 : minRange;
        System.out.print("Enter maximal value of range (int): ");
        maxRange = scanner.nextInt();
        scanner.close();
    }

    /**
     * Find prime numbers in range
     */
    public static void findPrimeNumbers()
    {
        for (int number = minRange; number < maxRange; number++) {
            if (isPrime(number)) {
                primeNumbers.insert(number);
            }
        }
    }

    /**
     * Is a prime number
     */
    public static boolean isPrime(int value)
    {
        if (value <= 1) {
            return false;
        }
        for (int i = 2; i * i < value; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;
    }
}

class Array {
  
  	private int arr[];
    private int count;

    // Method to return length of array
    public Array(int size)
    {
      	arr = new int[size]; 
    }

    public int length() 
    {
        return count;
    }

    // Method to print array
    public void printArray()
    {
        for (int i = 0; i < count; i++) 
			System.out.print(arr[i] + " ");
    }

    // Method to insert element in array
    public void insert(int ele)
    {
        if (arr.length == count) {
            // Creating a new array double the size
            // of array declared above
            int newArr[] = new int[2 * count];

            for (int i = 0; i < count; i++)
                newArr[i] = arr[i];

            // Assigning new array to original array
            arr = newArr;
        }

        arr[count++] = ele;
    }
}