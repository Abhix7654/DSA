package DSA;

import java.util.HashSet;

public class Q73_Longest_consecutive_sequence {
    public static int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        HashSet<Integer> set = new HashSet<>();
        for (int n : nums){
            set.add(n);
        }

        int count = 1;

        for (int num : nums) {
            if (!set.contains(num - 1)) {
                int tempCount = 1;
                while (set.contains(num + 1)) {
                    tempCount++;
                    num++;
                }
                count = Math.max(count, tempCount);
            }

            if (count > nums.length / 2) break;
        }

        return count;
    }

    public static void main(String[] args) {
        int arr[]={100,4,200,1,3,2};
        System.out.println(longestConsecutive(arr));
    }
}
