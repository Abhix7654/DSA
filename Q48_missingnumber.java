package DSA;

import java.util.Arrays;

public class Q48_missingnumber {
    public static void main(String[] args) {
        int nums[] = {0, 1, 1, 3, 4,};
        int i = 0;
        while (i < nums.length) {
            int position = nums[i];
            if (nums[i] != nums[position]) {
                int temp = nums[i];
                nums[i] = nums[position];
                nums[position] = temp;
            } else {
                i++;
            }
        }
            System.out.println(Arrays.toString(nums));
            int c = 0;
            for (int j = 0; j < nums.length; j++) {

                if (nums[j] != j)
                    System.out.println(j);
                else
                    c++;
            }
            if (c == nums.length)
                System.out.println(nums.length);
        }
    }
