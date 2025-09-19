import java.util.Scanner;

public class temstatus { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter temperature in celsius : ");
        int celsius = sc.nextInt();

        String status= "";
        //logic
       if (celsius < 20) {status = "Cold";}
        else if (celsius >= 20 && celsius <= 35) {status = "Normal";}
        else if (celsius > 35) {status = "Hot";}

        //output 
        System.out.println("temperature : "+celsius+"C");
        System.out.println("status :"+status);

    }
}
