package DSA;

import java.util.Arrays;

public class Q32_removegreatestonright {
    public static void main(String[] args) {
        int arr[]={17,18,5,4,6,1};
        int max=-1;
        int n=arr.length;
        int[] nums=new int[n];
        for(int i=n-1;i>=0;i--){
            nums[i]=max;
            if(arr[i]>=max){
                max=arr[i];
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
