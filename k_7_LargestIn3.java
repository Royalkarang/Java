public class k_7_LargestIn3 {
    public static int LargestInThree(int x,int y,int z) {
        if ((x > y) && (x>z)) {
            return x;
        } 
        else if ((y> x) && (y>z)) {
            return y;
        }
        else {
            return z;
        }
    }
    public static void main(String[] args) {
    System.out.println("Largest Number is " + LargestInThree(3,9,5));
    }
}
