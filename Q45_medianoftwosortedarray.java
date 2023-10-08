package DSA;

import java.util.Arrays;

public class Q45_medianoftwosortedarray {
    public static void main(String[] args) {
        int[] nums1 = {2,4,6,6};
        int[] nums2 = {44,7,3,7};
        if (nums1.length == 0 && nums2.length == 0) {
            System.out.println(-1);
        }

        int nums3[] = new int[nums2.length + nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            nums3[i] = nums1[i];
        }
        for (int i = nums3.length - 1; i >= nums1.length; i--) {
            nums3[i] = nums2[i - nums1.length];
        }
        Arrays.sort(nums3);
        if (nums3.length % 2 == 0) {
            int n1 = nums3[nums3.length / 2];
            int n2 = nums3[(nums3.length / 2) - 1];
            double ans = (double) (n1 + n2) / 2;
            System.out.println(ans);
        } else {
            System.out.println((double) nums3[nums3.length / 2]);

        }

    }
}