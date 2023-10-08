package DSA;

public class Q27_Maxconsicutive {
    public static void main(String[] args) {

        int nums[] = {0, 1, 1, 1, 1, 1, 0};
        int i, c = 0, max = 0;
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                c++;
            else {
                if (max < c)
                    max = c;
                c = 0;
            }
        }
        System.out.println(max);

    }}