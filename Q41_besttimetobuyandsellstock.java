package DSA;

public class Q41_besttimetobuyandsellstock {
    public static void main(String[] args) {
        int nums[]={7,1,5,3,6,4};
        int min=nums[0];
        int max=0;

        for(int i=1;i<nums.length;i++){
            if(min>nums[i])
                min=nums[i];
            if(max<nums[i]-min)
                max=nums[i]-min;
        }
        int result=max-min;
        System.out.println(max);
    }
}
