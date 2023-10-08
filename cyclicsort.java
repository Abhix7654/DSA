package DSA;

import java.util.Arrays;

public class cyclicsort {
    public static void main(String[] args) {
        int arr[] = {4, 1, 5, 6, 3, 2};
        for (int i = 0; i < arr.length;) {
            if (arr[i] != i + 1) {
                int t = arr[i];
                int j = arr[i] - 1;
                arr[i] = arr[j];
                arr[j] = t;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
