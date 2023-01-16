import java.util.Scanner;

public class k_12_VowelOrConsonent {
    static void VowelOrConsonent(String c) {
        if(c=="A" || c =="a" || c=="E" || c=="e" || c=="I" || c=="i" || c=="O" || c=="o" || c=="u" || c=="U") {
            System.out.println("Vowel");
        }
        else {
            System.out.println("Consonent");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter Any Character: ");
        String c = sc.next();
        VowelOrConsonent(c);
        sc.close();
    }
}