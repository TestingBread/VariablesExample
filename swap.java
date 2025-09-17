import java.util.Scanner;

public class swap {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
    //input
        System.out.print("Enter num1:");
        int num1 = sc.nextInt();

        System.out.print("Enter num2 :");
        int num2 = sc.nextInt();

    //swap
        num1 = num1^num2;
        num2 = num1^num2;
        num1 = num1^num2;

    //output
        System.out.println("num1 is "+num1+"|| num2 is "+num2);


    }
}