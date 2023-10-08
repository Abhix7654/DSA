package DSA;

public class Q15_factor {
    public static void main(String[] args) {
        int n = 100;
        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                System.out.println(i);

            }
        }
        for (int i = (int) Math.sqrt(n); i >= 1; i--) {
            if (n % i == 0) {
                System.out.println(n / i);
                // System.out.println(abh(6));
            }
        }

    } 
}
