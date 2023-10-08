package DSA;

import java.util.Arrays;

public class Q23_larscarray {
    public static void main(String[] args) {
        int arr[] = {3, 8, 3, 4, 9, 7};

        // Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] >= arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }}

                System.out.println(Arrays.toString(arr));
                System.out.println(arr[arr.length - 1]);
                System.out.println(arr[arr.length - 2]);
            }
        }
