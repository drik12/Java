import java.util.Scanner;

public class RunningSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 1; i < n; i++) {
          arr[i] = arr[i] + arr[i - 1];
        }


        System.out.println("Running Sum Array:");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + " ");
            }

        sc.close();
    }
}