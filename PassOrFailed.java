import java.util.Scanner;

public class PassOrFailed {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("midterm score:");
        int MidSc = sc.nextInt();

        System.out.print("Final score:");
        int FinSc = sc.nextInt();

        int totalSc = MidSc+FinSc;

        if (totalSc >= 50) {

            System.out.println("your total score is "+totalSc+" You Passed!");
        }
        
        else{
            System.out.println("your total score is "+totalSc+" You FAILED!");
        }
       
    }
} //🍞 is cooked