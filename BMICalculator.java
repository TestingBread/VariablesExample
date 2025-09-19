import java.util.Scanner;
public class BMICalculator {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight :");
        double weight = scanner.nextDouble();

        System.out.print("Enter your height :");
        double height = scanner.nextDouble();

        double BMI = weight/(height*height);

        System.out.println("your BMI for weight = "+weight+" and height = "+height+"meters is :"+BMI+".");
    }
}