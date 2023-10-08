package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q18_GDCofArray {
    public static void main(String[] args) {
        int nums[]={2,3,4,6,7,8};

            Arrays.sort(nums);
            int result=0;

            for(int i=1;i<=nums[0];i++) {
                if (nums[0] % i == 0 && nums[nums.length - 1] % i == 0)
                    result = i;

            }
//        int min = nums[0];
//        int max = nums[0];
//        int result=0;
//
//        for (int i = 1; i < nums.length; i++) {
//            min = Math.min(nums[i], min);
//            max = Math.max(nums[i], max);
//        }
//
//        for(int i=1;i<=min&&i<=max;i++){
//            if(max%i==0 && min%i==0)
//                result=i;

            System.out.println(result);

    }
}
