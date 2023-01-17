import java.util.Scanner;

public class k_9_HCF {
    public static int FindHcf(int x, int y) {
        if (x==0) {
            return y;
        }
        return FindHcf(y%x,x);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First No.: ");
        int x= sc.nextInt();
        System.out.println("Enter Second No.: ");
        int y = sc.nextInt();
        int result = FindHcf(x,y);
        System.out.println(result);
        sc.close();
    }
}
