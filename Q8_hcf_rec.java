package DSA;

public class Q8_hcf_rec {
    public static int hcf(int n,int v) {
        if(v==0)
            return n;
        return hcf(v,n%v);

//        if (n==v)
//            return n;
//        if (n > v)
//            return hcf(n - v, v);
//        else
//            return hcf(n, v - n);

    }
    public static void main(String[] args) {
//        int n=20;
//        int v=48;
//        int hc=1;
//        for(int i=2;i<=n||i<=v;i++){
//            if(n%i==0&&v%i==0) {
//
//                hc = i;
 //           }
 //       }

        System.out.println(hcf(8,54));
    }
}
