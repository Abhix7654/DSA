package DSA;

import java.util.HashMap;
import java.util.Map;

public class Q72_Contiguous_aray {
    public static int findMaxLength(int[] nums) {

        int maxsum = 0;
        int currsum = 0;
        Map<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        for(int i = 0; i < nums.length; i++){
            currsum += nums[i] == 0 ? -1 : nums[i];

            if(map.containsKey(currsum)){
                maxsum = Math.max(maxsum, i - map.get(currsum));
            } else {
                map.put(currsum, i);
            }

        }

        return maxsum;
    }

    public static void main(String[] args) {
        int arr[]={0,1,0,1,2,3,0,1,1};
        System.out.println(findMaxLength(arr));
    }
}
