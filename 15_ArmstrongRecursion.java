import java.util.*;
class Armstrong{
    static int Armstrong(int n,int sum) {
        int rem;
        if(n==0){
            return sum;
        }
        { 
        rem= n%10;
        sum= sum+rem*rem*rem;
        n=n/10;
        }
    return Armstrong(n,sum);
    } 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n= sc.nextInt();
        int sum=0;
        int arm = Armstrong(n,sum);
        if (arm==n){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not a Armstrong Number");
        }
        sc.close();
    }
}
