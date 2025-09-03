import java.util.Scanner;

public class ProDuckUpgrade {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        //1
        System.out.print("ProDuct #1 Name :");
        String Name1 = sc.nextLine();
        
        System.out.print("ProDuct #1 Price :");
        double Price1 = sc.nextDouble();
        sc.nextLine();

        System.out.print("quantity for product1 :");
        double quantity1 = sc.nextDouble();
        sc.nextLine();


        //-------
        //2
        System.out.print("ProDuct #2 Name :");
        String Name2 = sc.nextLine();

        System.out.print("ProDuct #2 Price :");
        double Price2 = sc.nextDouble();
        sc.nextLine();

        System.out.print("quantity for product2 :");
        double quantity2 = sc.nextDouble();
        sc.nextLine();


        //-------
        //3
        System.out.print("ProDuct #3 Name :");
        String Name3 = sc.nextLine();

        System.out.print("ProDuct #3 Price :");
        double Price3 = sc.nextDouble();
        sc.nextLine();

        System.out.print("quantity for product3 :");
        double quantity3 = sc.nextDouble();
        sc.nextLine();

        
        //paid
        System.out.print("Customer Paid :");
        double CPaid = sc.nextDouble();

        //mathing
        double item1 = Price1*quantity1;
        double item2 = Price2*quantity2;
        double item3 = Price3*quantity3;
        double Summary_Price = item1+item2+item3;
        double Vat = Summary_Price*0.07;
        double Net = Vat+Summary_Price;
        double change = CPaid-Net;


        //output
        System.out.println("-------receipt-------");

        System.out.println(Name1+":"+Price1+" x "+quantity1+" = "+item1);
        System.out.println(Name2+":"+Price2+" x "+quantity2+" = "+item2);
        System.out.println(Name3+":"+Price3+" x "+quantity3+" = "+item3);

        System.out.println("total price no tax "+Summary_Price);
        System.out.printf("Vat %.2f baht\n",Vat);
        System.out.println("Net price "+Net+" baht");
        System.out.println("Change "+change+" baht");

        //🍞Cooked 👍

    }

}