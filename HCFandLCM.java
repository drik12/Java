import java.util.Scanner;

public class HCFandLCM {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a= sc.nextInt();

        System.out.print("Enter second number: ");
        int b= sc.nextInt();

        int num1=a;
        int num2=b;

        while(b!=0){
            int temp =b;
            b=a%b;
            a = temp;

        }

        int hcf=a;

        int lcm= (num1 * num2)/hcf;

        System.out.println("HCF(GCD) = " + hcf);
        System.out.println("LCM = " + lcm);

    }
}
