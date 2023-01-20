import java.util.Scanner;
public class armstrong{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the No. : ");
        int a= sc.nextInt();
        int temp = a;
        int sum=0;
        while (a>0) {
            int rem = a%10;
            sum += Math.pow(rem, 3);
            //sum = sum + rem*rem*rem;
            a=a/10;
        }
        System.out.println("\t \t Result \t \t");
        if (sum == temp) {
            System.out.println("Armstrong Number");
        }
        else {
            System.out.println("Not an Armstrong");
        } sc.close();
    }
    
}
