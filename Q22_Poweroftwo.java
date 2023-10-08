package DSA;

public class Q22_Poweroftwo {
    public static void main(String[] args) {
        int n = 16;
        if (n < 1)
            System.out.println(false);
        else if (n == 1)
            System.out.println(true);
        else if (n % 2 != 0)
            System.out.println(false);
        else
            while (n != 0) {
                n = n / 2;
                if (n % 2 != 0)
                    break;
            }
        if (n == 1)
            System.out.println(true);
        else
            System.out.println(false);


    }

}
