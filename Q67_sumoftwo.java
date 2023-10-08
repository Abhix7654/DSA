package DSA;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q67_sumoftwo {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numToIndex.containsKey(complement)) {
                return new int[]{numToIndex.get(complement), i};
            }
            numToIndex.put(nums[i], i);
        }
        throw new IllegalArgumentException("No solution found");
    }
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums,target)));
    }
}
