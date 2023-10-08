package DSA;

import java.util.Arrays;

public class Q31_duplicatezero {
    public static void main(String[] args) {
        int arr[]={1,2,0,5,0,6,8};

        int len = arr.length;
      if(len == 1)
          return;
      int start = 0, end = len-1;
        while(start < end){
            if(arr[start] == 0)
                end--;
            start++;
        }
       if(end == len-1)
           return;
        for(int i = len-1; i >= 0 && end >= 0; i--, end--){
            arr[i] = arr[end];
            if(arr[end] == 0 && end != start){
                arr[i-1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}
