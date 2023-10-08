package DSA;

import java.util.Arrays;

public class Q57_firstandlastpositionofsortedarray {
    public static int first(int[] nums, int target) {
        int ans = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                high = mid - 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static int last(int[] nums, int target) {
        int ans = -1;
        int low = 0, high = nums.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (nums[mid] == target) {
                ans = mid;
                low = mid + 1;
            } else if (nums[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[] = {5, 7, 7, 8, 8, 10};
        int nums[] = {first(arr, 8), last(arr, 8)};


        System.out.println(Arrays.toString(nums));

    }
}
