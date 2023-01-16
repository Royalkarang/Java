import java.util.Scanner;
public class k_3_Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your First Number : ");
        float n1 = sc.nextFloat();
        System.out.println("Enter Your Second Number : ");
        float n2 = sc.nextFloat();
        float Multiply = n1*n2;
        System.out.println(Multiply);
        sc.close();
    }
}
