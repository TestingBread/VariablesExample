import java.util.Scanner;

public class BMR {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("your gender man(M) women(G) :");
        char gender = sc.next().charAt(0);

        System.out.print("age :");
        int age = sc.nextInt();

        System.out.print("height :");
        int height = sc.nextInt();

        System.out.print("weight :");
        int weight = sc.nextInt();



        //BMR mathing
        if (gender=='m' || gender=='M') {
            double BMRM = 66+((13.7*weight)+(5*height))-(6.8*age);
            
             System.out.println("ur BMR is "+BMRM); //temp output
        }
        else if (gender=='G' || gender=='g') {
            double BMRG = 655+((9.6*weight)+(1.8*height))-(4.7*age);

             System.out.println("ur BMR is "+BMRG); //temp output
        }
        else{
            System.out.println("What...");
        }
        

        //output should be here but i'll patch later

        //Cooked medium-rare
    }
}