package DSA;

public class Q19_Lcm_eucledian {
    public static void main(String[] args) {
        int n=20;
        int v=48;
        int hc=1;
        for(int i=2;i<=n||i<=v;i++){
            if(n%i==0&&v%i==0) {
                hc = i;
                   }
               }
        int LCM=(n*v)/hc;
        System.out.println(LCM);
    }

}
