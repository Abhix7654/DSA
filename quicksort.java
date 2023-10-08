package DSA;

import java.util.Arrays;

public class quicksort {
    static void sort(int arr[],int st,int ed){
        if(st>=ed)return;
        int pidx=partition(arr,st,ed);
        sort(arr, st, pidx-1);
        sort(arr,pidx+1,ed);

    }
    static int partition(int arr[],int st,int ed){
        int i=st-1,pivot=arr[ed];
        for(int j=st;j<arr.length-1;j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        } i++;
            int temp=arr[i];
            arr[i]=arr[ed];
            arr[ed]=temp;
        return i;
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,4,3,1};
        sort(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
