import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter fahrenheit :");
        double Fahrenheit = sc.nextDouble();

        double celsius = (Fahrenheit-32)*5/9;

        System.out.println("fahrenheit = "+Fahrenheit);
        System.out.println("celsius = "+celsius);
    }
}