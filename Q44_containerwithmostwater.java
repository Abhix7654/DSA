package DSA;

public class Q44_containerwithmostwater {
    public static void main(String[] args) {
        int height[]={1,8,6,2,5,4,8,3,7};
        int leftmax = 0;
        int rightmax = height.length - 1;
        int ans = 0;

        while (leftmax < rightmax) {
            int currentArea = Math.min(height[leftmax], height[rightmax]) * (rightmax - leftmax);
            ans = Math.max(ans, currentArea);

            if (height[leftmax] < height[rightmax]) {
                leftmax++;
            } else {
                rightmax--;
            }
        }

        System.out.println(ans);

    }
}
