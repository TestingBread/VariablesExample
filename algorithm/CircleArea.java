import java.util.Scanner;
public class CircleArea {
    public static void main (String[] args) {
        
        System.out.println("Enter radius: ");
        Scanner scanner = new Scanner(System.in);
        double radius = scanner.nextDouble();

        double areaCircle = 3.14 * radius * radius;
        
        System.out.println("area of circle is ="+areaCircle);
    

    }

//DONE
}