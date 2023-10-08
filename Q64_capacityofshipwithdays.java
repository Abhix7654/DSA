package DSA;

public class Q64_capacityofshipwithdays {
        public static int shipWithinDays(int[] weights, int days) {
            int len = weights.length;
            int maxWeights = 0;
            int max  = Integer.MIN_VALUE;
            for(int i = 0;i < len;i++) {
                max=Math.max(max,weights[i]);
                maxWeights += weights[i];
            }
            int start = max;
            int end = maxWeights;
            while(start <= end) {
                int midWeight = (start+end) / 2;
                if(isCap(weights,midWeight,days)) {
                    end = midWeight - 1;
                } else {
                    start = midWeight + 1;
                }
            }
            return start;
        }

      public static boolean isCap(int weights[],int weight,int days) {
            int sum = 0;
            int count = 0;
            for(int i = 0;i < weights.length;i++) {
                sum+=weights[i];
                if(sum > weight) {
                    count++;
                    sum=weights[i];
                }
            }
            if(sum <= weight) count++;
            if(count <= days)  return true;
            return false;
        }

    public static void main(String[] args) {
            int arr[]={1,2,3,4,5,6,7,8,9,10};
            int d=5;
        System.out.println(shipWithinDays(arr,d));

    }

}
