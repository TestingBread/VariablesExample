import java.util.Scanner;

public class medicine { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter age :");
        int age = sc.nextInt();
        if (age <0) {
            System.out.println("age cannot be negative");
            System.exit(0);
        }


        if (age > 10) {
            System.out.println("Take 2 teaspoons.");
        }
        else if (age >3) {
            System.out.println("Take 1 teaspoons.");
        }
        else if (age >1) {
            System.out.println("Take 1/2 teaspoons.");
        }
        else {System.out.println("Do not take medicine.");}
    

    }
}
