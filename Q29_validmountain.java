package DSA;

public class Q29_validmountain {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,4,3,2,1};
        int n = arr.length;
        if (n < 3)
            System.out.println("false");
        int l = 0, r = n - 1;
        while (l < n - 2 && arr[l] < arr[l + 1]) {
            l++;
        }
        while (r > 1 && arr[r] < arr[r - 1]) {
            r--;
        }
        if(l == r)
            System.out.println("true");
        else System.out.println("false");

    }
}
