import java.util.Scanner;

public class k_5_BinaryAdd {
    public static int BinaryAddition(String x, String y) {
        int num1 = Integer.parseInt(x,2);
        System.out.println("First No. in integer is : "+num1);
        int num2 = Integer.parseInt(y, 2);
        System.out.println("Second No. in Integer is : "+num2);
        int sum = num1 + num2;
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t \t This Program is For Binary Addition \t \t");
        System.out.println("Enter First No. (Binary) :- ");
        String n1= sc.nextLine();
        System.out.println("Enter Second No. (Binary) :- ");
        String n2= sc.nextLine();

        int result = BinaryAddition(n1,n2);
        System.out.println("Addition of Binary is - "+result);

        sc.close();
    }
}
