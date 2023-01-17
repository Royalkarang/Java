                            //Simple Method I
public class k_8_LCM {
    public static void main(String[] args) {
        int n = 8;
        int l = 21;
        int g = 0;
            for(int i =1; i<=n; i++){
                if(n%i==0 && l%i==0){
                    g=i;
                }
            }
            int lcm = n*l /g;
            System.out.println(lcm);
        }
    }                           
                            // Method II (Function)
// import java.util.Scanner;
// public class k_8_LCM {
//     public static int FindLCM(int x, int y,int g) {
//         for(int i= 1; i<=x;i++) {
//             if(x%i ==0 && y%i==0) {
//                 g=i;
//             }
//         }
//         int lcm = x*y/g;
//         return lcm;
    
//     }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter First No.: ");
//         int x= sc.nextInt();
//         System.out.println("Enter Second No : ");
//         int y = sc.nextInt();
//         int result = FindLCM(x,y,0);
//         System.out.println("L.Cm.M is : " + result);
//         sc.close();
//     }
// }

                        // Method III (Recursion)
// import java.util.Scanner;
// public class k_8_LCM {  
//     public static int hcf(int x, int y) {
//         if (x ==0) {
//             return y;
//         } 
//         return hcf(y%x, x);
//         }
//         public static int FindLCM(int x,int y) {
//             return (x/hcf(x, y)*y);
//         }
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         System.out.println("Enter First No.: ");
//         int x= sc.nextInt();
//         System.out.println("Enter Second No : ");
//         int y = sc.nextInt();
//         int result = FindLCM(x,y);
//         System.out.println("L.C.M is : " + result);
//         sc.close();
//     }
// } 
