import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input size of array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        // Input array elements
        System.out.print("Enter the elements: ");
        int actualSum = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            actualSum += arr[i];
        }

        // Expected sum of numbers from 0 to n
        int expectedSum = n * (n + 1) / 2;

        // Missing number
        int missing = expectedSum - actualSum;

        System.out.println("Missing Number = " + missing);

        sc.close();
    }
}