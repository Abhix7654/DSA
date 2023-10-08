package DSA;

import java.util.Arrays;

public class Q28_mergesortedarray {
    public static void main(String[] args) {
        int nums1[]={1,2,3,4,5,0,0,0};
        int nums2[]={6,7,8};
        int n=nums2.length;
        int m=5;
        for (int j = 0, i = m; j < n; j++) {
            nums1[i] = nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        System.out.println(Arrays.toString(nums1));

    }
}
