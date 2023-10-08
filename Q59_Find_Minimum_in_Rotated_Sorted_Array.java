package DSA;

public class Q59_Find_Minimum_in_Rotated_Sorted_Array {
    static int mm(int nums[]){
        int start=0,end=nums.length-1;

        while(start<end){
            int mid=start+(end-start)/2;
            if(nums[mid]<nums[end])
                end=mid;
            else
                start=mid+1;
        }
        return  nums[start];
    }

    public static void main(String[] args) {
        int arr[]={4,5,6,7,1,2};
        System.out.println(mm(arr));
    }
}
