import java.util.Scanner;
public class k_6_factorial {
    public static int FactorialNum(int num){
        if(num ==1) {
            return 1;
        }
        else {
            return num*FactorialNum(num-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Factorial Number : ");
        int num = sc.nextInt();
        System.out.println("Your Factorial is : " + FactorialNum(num));
        sc.close();
    }
}