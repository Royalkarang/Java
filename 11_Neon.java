class k_11_Neon{
    public static boolean Neon(int n) {
        int square= n*n;
        int sum = 0;
        while (square > 0) {
            int reminder = square %10;
            sum += reminder;
            square = square/10;
        }
        if(sum ==n) {
            return true;
        }
        else {
            return false;
        }
        }
    public static void main(String[] args) {
        int n =8;
        if (Neon(n)) {
            System.out.println("Number is Neon");
        }
        else {
            System.out.println("Number is Not a Neon Number");
        }
    }
}
