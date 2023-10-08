package DSA;

import java.util.HashSet;

public class Q66_print_unique {
    public static void main(String[] args) {


        int[] arr = {1, 2, 22, 3, 4, 7, 2, 4, 6, 7, 4};
        HashSet<Integer> set = new HashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        System.out.println(set);
    }
}
