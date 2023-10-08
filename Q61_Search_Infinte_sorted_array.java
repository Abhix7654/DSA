package DSA;

import java.util.ArrayList;
import java.util.Arrays;

public class Q61_Search_Infinte_sorted_array {
    public static int bs(int nums[], int target,int st,int ed) {

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
        return -1;}
    public static void main(String[] args) {

    int arr[]={1,2,3,4,5,6,9};

    int start=0,end=start+1,target=5;
    while (start<end){
        if(target>end)
            end=end*2;
        else break;}
        System.out.println(bs(arr,target,start,end));
}
}