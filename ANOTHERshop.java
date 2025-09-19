import java.util.Scanner;

public class ANOTHERshop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
    //input
        System.out.print("Enter price of the product :");
        int price = sc.nextInt();

        System.out.print("Enter quatity of the product :");
        int quatity = sc.nextInt();

    // math
        double totalpay = price*quatity;
    //logic
        if (quatity>10) {
            totalpay = totalpay * 0.90;
        }


    //output
        System.out.printf("total price :%.1f\n",totalpay);


    }
}