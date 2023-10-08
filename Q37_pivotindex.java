package DSA;

public class Q37_pivotindex {
    public static void main(String[] args) {
        int arr[]={1,3,5,2,2};
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        int leftsum=0;
        int rightsum=sum;
        for(int i=0;i<arr.length;i++){
            rightsum-=arr[i];
            if (leftsum==rightsum) {
                System.out.println(i);
            }
            else
                leftsum+=arr[i];

        }
        if (leftsum!=rightsum);
        System.out.println(-1);
    }
}
