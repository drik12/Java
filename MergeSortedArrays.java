import java.util.Scanner;

public class MergeSortedArrays {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Size of first array: ");
        int n = sc.nextInt();
        int[] arr1= new int[n];

        System.out.println("Enter sorted elements: ");
        for(int i=0; i<n; i++){
            arr1[i]=sc.nextInt();
        }

        System.out.println("Size of second array: ");
        int m = sc.nextInt();
        int[] arr2 = new int[m];
        
        System.out.println("Enter sorted elements: ");
        for(int j=0; j<m; j++){
            arr2[j] = sc.nextInt();
        }

        int[] merged = new int[n+m];
        int i=0, j=0, k=0;

        while (i<n && j<m){
            if(arr1[i]<= arr2[j]){
                merged[k] = arr1[i];
                i++;
            }else{
                merged[k] = arr2[j];
                j++;

            }
            k++;
        }

        while(i<n){
            merged[k]= arr1[i];
            i++;
            k++;

        }

        while(j<m){
            merged[k]= arr2[j];
            j++;
            k++;
        }

        System.out.println("Merged sorted array: ");
        for (int num: merged){
            System.out.println(num + " ");

        }

        sc.close();

    }
}
