package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Q68_Intersection_Two_Arrays {
    public static int[] intersection(int[] nums1, int[] nums2)
    {
        HashSet<Integer> set1 = new HashSet<>();
        HashSet<Integer> set2 = new HashSet<>();

        for (int n : nums1) {
            set1.add(n);
        }

        for (int n : nums2) {
            if (set1.contains(n))
                set2.add(n);
        }

        int [] result = new int[set2.size()];
        int index = 0;
        for (int n : set2){
            result[index++] = n;
        }

        return result;
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        int nums[]={2,3,4,6};
        System.out.println(Arrays.toString(intersection(arr,nums)));

    }
}
