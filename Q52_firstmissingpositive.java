package DSA;

public class Q52_firstmissingpositive {
    public static void main(String[] args) {
        int nums[]={3,4,-1,1,2};
        int i =0;
        while(i<nums.length){
            if(nums[i]<=nums.length && nums[i]>0 && i != nums[i]-1){
                if(nums[i] == nums[nums[i]-1]){
                    i++;
                }else{
                    int temp = nums[i];
                    nums[i] = nums[temp-1];
                    nums[temp-1] = temp;
                }

            }else{
                i++;
            }
        }
        boolean v=true;
        for(int j=0;j<nums.length ; j++){
            if(j != nums[j]-1){
                System.out.println(j+1);
                v=false;
                break;
            }


        }
        if (v==true)
            System.out.println( nums.length+1);


    }
}
