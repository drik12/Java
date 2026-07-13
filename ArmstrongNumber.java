import java.util.Scanner;

public class ArmstrongNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number: ");

        int num = sc.nextInt();

        int original = num;
        int temp = num;
        int digits= 0;

        while(temp!= 0){
            digits++;
            temp/=10;
            
        }

        temp=num;
        int sum=0;

        while(temp!=0){
            int digit= temp%10;
            sum+=(int)Math.pow(digit, digits);
            temp/=10;

        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number.");
        } else {
            System.out.println(original + " is not an Armstrong number.");
        }

        sc.close();
    }
}