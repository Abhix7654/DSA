package DSA;

public class Q63_findminimummaxpage {

    public static int findPages(int[]A,int N,int M)
    {
        if(N<M){
            return -1;
        }
        int low=0;
        int high=0;

        for(int i=0; i<A.length; i++){

            if(A[i]>low){
                low= A[i];
            }

            high+= A[i];
        }

        int res=-1;

        while(low<=high){

            int mid= (low+high)/2;

            if(isAllocatable(A, mid, M)){
                res=mid;
                high= mid-1;
            }else{
                low= mid+1;
            }

        }

        return res;
    }

    public static boolean isAllocatable(int[] A, int mid, int M){

        int student=1;
        int sum=0;

        for(int i=0; i<A.length; i++){

            if(sum+A[i]> mid){
                student++;
                sum=A[i];
            }else{
                sum+= A[i];
            }


        }

        return student<=M;}

    public static void main(String[] args) {
        int arr[]={40,60,30,100,50};
        int book=5;
        int student=3;
        System.out.println(findPages(arr,book,student));
    }
    }
