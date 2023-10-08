package DSA;

public class Q20_sqrt {
    public static void main(String[] args) {

        int x = 12;
        int ans = 0;
        if (x == 0)
            System.out.println(0);
        for (int i = 1; i <= x / i; i++) {
            ans = i;
        }
        System.out.println(ans);
    }
}