import java.util.Scanner;

public class TrueOrFalse {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("tell me a number :");
        int num = sc.nextInt();

        if (num > 0) {

            System.out.println("จำนวนเต็มบวก");
        }
        
        else{
            System.out.println("ไม่ใช่จำนวนเต็มบวก");
        }
        System.out.println("จบโปรแกรม");
    }
} //🍞 is cooked