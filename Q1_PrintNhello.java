package DSA;

public class Q1_PrintNhello {
    public static void pr(int n){
        //base case
        if (n==0)
        return;
        System.out.println("hello");
        pr(n-1);
    }
    public static void main(String[] args) {
        int n=5;
        pr(n);}
}
