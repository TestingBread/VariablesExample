import java.util.Scanner;

public class Note {
    public static void main(String arg[]) {

        Scanner sc = new Scanner(System.in);

        //input
        System.out.print("Price :");
        int price = sc.nextInt();
        
        System.out.print("Customer paid :");
        int pay = sc.nextInt();
        

        int change = pay-price;

        //math
        int FiveHundred = change/500;
        int change1 = change%500;

        int Hundred = change1/100;
        int change2 = change1%100;

        int fitfy = change2/50;
        int change3 = change2%50;

        int Tweny = change3/20;
        int change4 = change3%20;

        int TenCoin = change4/10;
        int change5 = change4%10;

        int FiveCoin = change5/5;
        int change6 = change5%5;

        int TwoCoin = change6/2;
        int change7 = change6%2;


        //output
        if (price<=pay)
        {
            System.out.println("change ="+change);
            System.out.println("five hundred :"+FiveHundred);
            System.out.println("hundred :"+Hundred);
            System.out.println("fitfy :"+fitfy);
            System.out.println("tweny :"+Tweny);
            System.out.println("ten coin :"+TenCoin);
            System.out.println("five coin :"+FiveCoin);
            System.out.println("two coin :"+TwoCoin);
            System.out.println("one coin :"+change7);
        }
        else{
            System.out.println("NOT enough money!!");
        }
    }
} //Cooking 🍳