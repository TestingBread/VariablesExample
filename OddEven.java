import java.util.Scanner;
public class OddEven {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("tell me a number :");
        int num = sc.nextInt();

        if (num%2==0) {
            System.out.println("the number "+num+" is even.");
        }
        else{
            System.out.println("the number "+num+" is Odd.");
        }
        System.out.println("End");
    }
}