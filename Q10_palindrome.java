package DSA;

import java.util.Arrays;

public class Q10_palindrome {
    public static void main(String[] args) {
        int x = 121;
        int n = x;
        int b = 0;
        if (x < 0 || (x != 0 && x % 10 == 0))
            System.out.println("Not");

        else {
            while (n != 0) {
                int rem = n % 10;
                b = b * 10 + rem;
                n = n / 10;
            }
        }
        if (b==x){
            System.out.println("yes");
        }

    }

}


