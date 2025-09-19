import java.util.Scanner;

public class GradeCal { 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //input
        System.out.print("Enter name :");
        String name = sc.nextLine();

        System.out.print("Enter Score :");
        int score = sc.nextInt();

        char grade;
        //logic
        if (score>=80) {
            grade = 'A';
        }
        else if(score>=70) {
            grade = 'B';
        }
        else if(score>=60) {
            grade = 'C';
        }
        else if(score>=50) {
            grade = 'D';
        }
        else {
            grade = 'E';
        }
        //output
        System.out.println("-----Result-----");
        System.out.println("Name : "+name);
        System.out.println("Scroe : "+score);
        System.out.print("Grade : "+grade);

    }
}

