package DSA;

public class Q2_Naturalno {
    public static void nat(int n) {
        if (n > 1)
            nat(n - 1);
            System.out.println(n);

        }

        public static void main (String[]args){
            int n = 5;
            nat(n);
        }
    }