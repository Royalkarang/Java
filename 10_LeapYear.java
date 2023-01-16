import java.util.Scanner;
public class k_10_LeapYear {
    public static void CheckLeapYear(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Year : ");
        int year = sc.nextInt();
        if ((year%4==0) || (year % 400==0)){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Not a Leap Year");
        }
        sc.close();
    }
    public static void main(String[] args) {
        CheckLeapYear();
    }
}
