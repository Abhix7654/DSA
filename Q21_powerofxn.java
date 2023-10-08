package DSA;

public class Q21_powerofxn {
    public static double pow(double x,int n){
        int v=n;
        double ans=1;
        if(n<0){
            v=-1*n;
        ans=x*pow(x,v-1);
        return 1.0/ans;}
        if (n==0)
            return 1;
        if (n>0)
            ans=x*pow(x,v-1);
        return ans;

    }
    public static void main(String[] args) {
        System.out.println(pow(2,-2));


    }
}