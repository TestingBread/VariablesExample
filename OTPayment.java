import java.util.Scanner;

public class OTPayment {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int OT;
        int hour;
        int Workerpayment;
        //input
        System.out.print("Pick type of OverTime\n1. Full-time (OT = 200/hr)\n2. Contract (OT = 150/hr\n3. Part-time (OT = 100/hr)\n");
        OT = sc.nextInt();
        //check input
        while (OT!=1&&OT!=2&&OT!=3) {
            System.out.println("Error. must pick 1 or 2 or 3");
            OT = sc.nextInt();
        }
        if (OT==1) {OT=200;}
            else if (OT==2) {OT=150;}
                else if (OT==3) {OT=100;}
        //input
        System.out.print("Enter your payment :");
        Workerpayment = sc.nextInt();

        System.out.print("How many hours you work on OverTime :");
        hour = sc.nextInt();
        //output
        OT = OT*hour;
        System.out.println("\n\nyour payment is "+Workerpayment);
        System.out.println("you get $ from overtime = "+OT);
        System.out.println("Summary your payment is :"+(Workerpayment+OT));

    }
}