import java.util.Scanner;

public class Member {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Enter member level [Silver, Gold, Platium] : ");
        String memberlv = sc.nextLine().toLowerCase();

        System.out.print("Enter Purchase : ");
        double Purchase = sc.nextDouble();
        double discount;
        
        //logic
        if (memberlv.equals("silver")) {discount = Purchase*0.05;}
            else if (memberlv.equals("gold")) {discount = Purchase*0.1;}
            else if (memberlv.equals("platium")) {discount = Purchase*0.15;}
        else {discount=0;}

        //output
        System.out.println("----Receipt----");
        System.out.println("member level : "+memberlv);
        System.out.printf("Purchase : %.1f\n", Purchase);
        if (discount==0) {System.out.println("discount : No");}
        else {System.out.println("discount : "+discount);}
        System.out.println("Final price : "+(Purchase-discount));

    }
} //Cooking 🍳