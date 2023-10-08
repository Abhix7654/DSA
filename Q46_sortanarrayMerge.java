package DSA;

import java.util.Arrays;

public class Q46_sortanarrayMerge {
    static void divide(int arr[],int st,int ed) {

        if (st >= ed)
            return;
        int mid = (st + ed) / 2;
        divide(arr, st, mid);
        divide(arr, mid + 1, ed);
        conquer(arr, st, mid, ed);
    }

    static void conquer(int arr[], int st, int mid, int ed) {
        int temp[] = new int[ed - st + 1];
        int ind1 = st;
        int ind2 = mid + 1;
        int k = 0;
        while (ind1 <= mid && ind2 <= ed) {
            if (arr[ind1] < arr[ind2])
                temp[k++] = arr[ind1++];
            else
                temp[k++] = arr[ind2++];
        }
        while (ind1 <= mid) temp[k++] = arr[ind1++];
        while (ind2 <= ed) temp[k++] = arr[ind2++];

        for (int i = 0, p = st; i < temp.length; i++, p++) {
            arr[p] = temp[i];
        }

    }

    public static void main(String[] args) {
        int arr[]={3,5,79,34,8};
        divide(arr,0,arr.length-1);
        System.out.println(Arrays.toString(arr));

    }
}
