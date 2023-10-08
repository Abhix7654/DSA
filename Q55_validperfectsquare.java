package DSA;

public class Q55_validperfectsquare {
  static boolean sq(int num){
        if(num==1)
            return true;
        long i=2;
        long j=num;
        while(i<j){
            long mid=i+(j-i)/2;
            long sq=mid*mid;
            if(sq==num)
                return true;
            else if(sq>num){
                j=mid;
            }
            else
                i=mid+1;
        }
        return false;
}

    public static void main(String[] args) {



            int num=16;
        System.out.println(sq(16));

    }
}
