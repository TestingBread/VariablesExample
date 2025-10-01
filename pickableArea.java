import java.util.Scanner;

public class pickableArea {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        double base;   //or length
        double width; 

        System.out.println("Enter your choice\n1 for square\n2 for rectangle\n3 for circle");
        base = sc.nextInt();
        //check input
        while (base!=1&&base!=2&&base!=3) {
            System.out.println("Enter your choice\n1 for square\n2 for rectangle\n3 for circle");
            System.out.println("เลือกเมนูผิดพลาด ลองอีกครั้ง");
            base = sc.nextDouble();
        }
        //mathing and logic
        if (base==1) { System.out.println("square");
            System.out.print("Enter area of square :");
            base = sc.nextDouble();
            base = base*base;
        }
        else if (base==2) { System.out.println("rectangle");
            System.out.print("Enter width of rectangle :");
            width = sc.nextDouble();

            System.out.print("Enter length of rectangle :");
            base = sc.nextDouble();
            base = width*base; //base = length at this point
        }
        else if (base==3) { System.out.println("circle");
            System.out.print("Enter radius of circle :");
            base = sc.nextDouble();
            base = 3.14*(base*base);
        }
        //output
        System.out.println("Area of your choice is "+base);

    }
}//จัตุรัส ด้าน x ด้าน 
//  ผ้า กว้าง x ยาว
//พายR^2 วงกลม