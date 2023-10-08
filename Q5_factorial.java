package DSA;

public class Q5_factorial {
    static int abh(int n){
        if(n<=1)
            return  1;
        n=n*abh(n-1);
        return n;


    }

    public static void main(String[] args) {
        System.out.println(abh(6));
    }



}
