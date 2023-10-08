package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q30_removeduplicatefromsorted {
    public static void main(String[] args) {
        int nums[]={1,1,2,2,3,4,5,5,6,6,7,7,8,8,9};
        int j = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[j] = nums[i];
                j++;
            }
        }
       for (int i=0;i<j;i++){
           System.out.print(nums[i]+" ");
       }
        System.out.println();
        System.out.println(j);
    }
}
