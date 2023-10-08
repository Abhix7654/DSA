package DSA;

import java.util.HashMap;

public class Q70_longestsunaaraywithk {
    public static int df(int A[], int K) {
        HashMap<Integer, Integer> map = new HashMap();

        int sum = 0;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < A.length; i++) {
            sum += A[i];

            if (sum == K) max = Math.max(max, i + 1);
            if (map.containsKey(sum - K)) max = Math.max(max, i - map.get(sum - K));
            if (!map.containsKey(sum)) map.put(sum, i);
        }

        if (max == Integer.MIN_VALUE) return 0;

        return max;

    }

    public static void main(String[] args) {
        int arr[] = {10, 5, 2, 7, 1, 9};
        int k = 15;

        System.out.println(df(arr, k));
    }
    }
