package DSA;

public class Q56_firstbadversion {
    public static int firstBadVersion(int n) {
        int start = 1;
        int finish = n;
        int med;

        while (start < finish)
        {
            med = start + (finish - start) / 2;
            if (med==6)
                finish = med;
            else
                start = med + 1;
        }
        return start;

    }

    public static void main(String[] args) {
        int n=12345;
        System.out.println(firstBadVersion(n));

    }
}
