import java.util.Scanner;
public class Shop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter price of dress :");
        float price = sc.nextFloat();

        System.out.print("how many :");
        float numberOfDress = sc.nextFloat();

        System.out.print("discount rate :");
        Float discount = sc.nextFloat();

        float totalCost = price*numberOfDress;
        float discountAmount = totalCost* discount/100;
        float netPay = totalCost-discountAmount;

        System.out.println("total cost :"+totalCost);
        System.out.println("discountAmount :"+discountAmount);
        System.out.println("Netpay :"+netPay);


        
    }
}