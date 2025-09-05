import java.util.Scanner;
public class ifshape {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("tell me a number :");
        int num = sc.nextInt();

        if (num==1) {
            System.out.print("Enter height for triangle: ");
            double height = sc.nextDouble();

            System.out.print("Enter base for triangle: ");
            double base = sc.nextDouble();

            double TriArea = base*height*0.5;

            System.out.println("Your triangle Area is "+TriArea);
        }
        else if (num==2) {
           
        System.out.print("Enter your weight (กิโลกรัม) :");
        double weight = sc.nextDouble();

        System.out.print("Enter your height (เมตร) :");
        double height = sc.nextDouble();

        double BMI = weight/(height*height);

        System.out.println("your BMI for weight = "+weight+" and height = "+height+"meters is :"+BMI+".");
        }
        else{
            System.out.println("WHAT GIMME A 1 or 2");
        }

        System.out.println("End");
    }
}