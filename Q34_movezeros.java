package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q34_movezeros {
    public static void main(String[] args) {
        int nums[]={1,0,4,0,5};
        int i = 0;
        for (int num : nums)
        {
            if (num != 0)
            {
                nums[i] = num;
                i++;
            }
        }

        while (i <= nums.length - 1)
        {
            nums[i] = 0;
            i++;
        }
        System.out.println(Arrays.toString(nums));

    }
}
