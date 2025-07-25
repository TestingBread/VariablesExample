public class VariablesExample {
    public static void main(String[] args) {
        //1.1 ตัวแปรที่จะใช้เก็บค่าของขนาดของเสื้อผ้า ชึ่งมีขนาดเป็น s, m หรือ 1
        char clothingSize = 's'; // ตัวแปรเก็บค่า

        int websiteVisitors = 0; //จำนวนคนชมเว็บ

        char studentGrade = 'A'; //ตัวแปรเก็บเกรด

        double studentGPA = 4.0; //เกรดเฉลี่ย

        final double PI = 3.14159; //ค่าคงที่ (ค่าคงที่)

        float annualExpenses = 15000.00F; //ค่าใช้จ่ายรายปี

        final int MONTHS_IN_YEAR = 12; //เดือนในปี (ค่าคงที่)


        System.out.println("Cloathing Size: " + clothingSize);
        System.out.println("Website Visitors: " + websiteVisitors);
        System.out.println("Student Grade: " + studentGrade);
        System.out.println("Student GPA: " + studentGPA);
        System.out.println("Value of Pi: " + PI);
        System.out.println("Annual Expenses: " + annualExpenses);
        System.out.println("Mounths in a year: " + MONTHS_IN_YEAR);
    }
}
