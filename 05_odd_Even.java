import java.util.Scanner;

public class k_4_odd_Even {
    static void CheckEvenOdd(int n) {
        if (n%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        int n = sc.nextInt();
        CheckEvenOdd(n);
        sc.close();
    }
}
