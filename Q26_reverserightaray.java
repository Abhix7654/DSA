package DSA;

import java.util.Arrays;

public class Q26_reverserightaray {
        public static void reverse(int[] nums,int start,int end){
            while(end>start){
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }
        public static void rotate(int[] nums, int k) {
            k%= nums.length;
            reverse(nums,0,nums.length-1);
            reverse(nums,0,k-1);
            reverse(nums,k,nums.length-1);


        }

    public static void main(String[] args) {
            int arr[]={22,1,2,1,1};
        rotate(arr,2);
        System.out.println(Arrays.toString(arr));
    }
    }

