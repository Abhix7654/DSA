package DSA;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q49_findallnodisapperedinarray {
    public static void main(String[] args) {
        int nums[]={4,3,2,7,8,2,3,1,0};
        List<Integer> list = new ArrayList<>();

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

//        for (i = 0; i < nums.length; i++) {
//            if (nums[i] != i + 1) {
//                list.add(i + 1);
//            }
//        }


    //    System.out.println(Arrays.toString(list.toArray()));;
        System.out.println(Arrays.toString(nums));
    }
}
