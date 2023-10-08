package DSA;

public class Q65_Koko_Eating_Bananas {
    public static int time(int arr[],int hour){
        int max=0;
        for (int i:arr){
            max=Math.max(max,i);
        }
        int start=0;
        int end=max;
        int speed=0;
        while (start<=end){
            int mid=start+(end-start)/2;
            if (check(arr,hour,mid)==true){
                speed=mid;
                end=mid-1;
            }else
                start=mid+1;
        }
        return speed;
    }
    public static boolean check(int arr[],int hour,int mid){
        int time=0;
        for (int i=0;i<arr.length;i++){
          time+=(arr[i]/mid);
         if(arr[i]/mid==0)time++;
        }

            return time<=hour;
    }

    public static void main(String[] args) {
        int arr[]={3,6,7,11};
        int hour=4;
        System.out.println(time(arr,hour));

    }
}
