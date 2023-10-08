package DSA;

public class Q6_sumofdigit {
    public static int sum(int n){
        if(n<11)
            return n;
        n=n%10+sum(n/10);

       return n;
    }

    public static void main(String[] args) {
        System.out.println(sum(16));
    }
}
