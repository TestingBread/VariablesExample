import java.util.Scanner;

public class payment {
    public static void main (String args[]) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter payment: ");
        int payment = scan.nextInt();
        int sum = payment*10/100;
        System.out.println("ต้องชำระภาษี :"+ sum+"บาท");
    }


}