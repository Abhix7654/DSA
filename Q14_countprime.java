package DSA;

public class Q14_countprime {
    public static boolean isprime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i = i + 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 1000;
        int c = 0;
        for (int i = 1; i <= n; i++) {
            if (isprime(i))
                c++;}
        System.out.println(c);
    }
}