package DSA;

import java.util.Arrays;

public class Q25_reverseleftbyk {

    public static void reverse(int[] nums, int start, int end) {
        while (end > start) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0, nums.length - 1);
        reverse(nums, nums.length-k, nums.length-1);
        reverse(nums, 0, nums.length-1-k);


    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5,4,6};
        rotate(arr, 3);
        System.out.println(Arrays.toString(arr));
    }
}
