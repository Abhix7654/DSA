package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q33_squareofsortedarray {
    public static void main(String[] args) {
        int arr[]={-4,-1,0,3,10};
        int nums[]=new int[arr.length];
        for (int i=0;i<arr.length;i++){
            nums[i]=arr[i]*arr[i];
        }
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
    }
}
