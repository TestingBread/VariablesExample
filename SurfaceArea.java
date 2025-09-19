import java.util.Scanner;
public class SurfaceArea {
    public static void main(String args[]) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your width :");
        int width = scanner.nextInt();

        System.out.print("Enter your length :");
        int length = scanner.nextInt();

        int BodySurfaceArea = (width*length)/360;

        System.out.println("Surface area is "+ BodySurfaceArea);
    }
}