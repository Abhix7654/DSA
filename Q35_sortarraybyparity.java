package DSA;

import java.util.Arrays;

public class Q35_sortarraybyparity {
    public static void main(String[] args) {
        int nums[]={3,1,2,4};
        int i=0;
        int j=0;
        while(i<nums.length)
        {
            if(nums[i]%2 == 0)
            {
                int a = nums[i];
                nums[i] = nums[j];
                nums[j]=a;
                j++;
            }
            i++;
        }
        System.out.println(Arrays.toString(nums));


    }
}
