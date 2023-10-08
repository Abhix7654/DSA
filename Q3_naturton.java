package DSA;

public class Q3_naturton {
    public static void nat(int n){
        if(n<=1)
            System.out.println(n);
        else {
            System.out.println(n);
            nat(n - 1);
        }


    }

    public static void main(String[] args) {
        nat(6);
    }
}
