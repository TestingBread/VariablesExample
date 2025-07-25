import java.util.Scanner;

public class triangle {
    public static void main (String args[]) {

        Scanner ScHeight = new Scanner(System.in);
        Scanner ScLength = new Scanner(System.in);
        Scanner ScBase = new Scanner(System.in);
        Scanner Scwidth = new Scanner(System.in);

        System.out.print("Enter height for triangle: ");
        double height = ScHeight.nextDouble();

        System.out.print("Enter base for triangle: ");
        double base = ScBase.nextDouble();

       double TriArea = base*height*0.5;

        System.out.println("Your triangle Area is "+TriArea);

        System.out.print("Enter length for Rectangle: ");
        int length = ScLength.nextInt();

        System.out.print("Enter width for Rectangle: ");
        int width = Scwidth.nextInt();

        int RecArea = length*width;

        System.out.println("Your Rectangle Area is "+RecArea);


    }

}