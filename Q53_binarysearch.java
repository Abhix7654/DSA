package DSA;

public class Q53_binarysearch {
    public static int bs(int nums[], int target) {
        int st = 0;
        int ed = nums.length - 1;


        while (st <= ed) {
            int mid = st + (ed - st) / 2;

            if (target == nums[mid]) {
                return mid;
            } else if (target < nums[mid]) {
                ed = mid - 1;
            } else {
                st = mid + 1;
            }
        }
        return -1;

    }

    public static void main(String[] args) {
        int arr[] = {1, 3, 5, 6, 7, 9, 12};
        int tar = 9;
        System.out.println(bs(arr, tar));

    }
}


