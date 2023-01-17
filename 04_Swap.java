import java.util.Scanner;
class k_4_Swap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENter Your First Number x: ");
        int x= sc.nextInt();
        System.out.println();
        System.out.print("Enter Your Second Number y: ");
        int y = sc.nextInt();
        // int temp = x;
        // x=y;
        // y= temp;

        y=x;
        x=y;
        System.out.println("x :- "+ x);
        System.out.println("y :- "+ y);
        sc.close();
    }
}
