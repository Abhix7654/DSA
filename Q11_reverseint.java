package DSA;

public class Q11_reverseint {
    public static void main(String[] args) {
        int x=113;
        int v=x;
        int b=0;
        while(v!=0){
            if(b>Integer.MAX_VALUE/10   || b<Integer.MIN_VALUE/10){
                System.out.println("0");
            }
            int rem=v%10;
            b=b*10+rem;
            v=v/10;

        }
        System.out.println(b);

    }
}
