package DSA;

public class Q12_adddigituntil {
    public static void main(String[] args) {
        int num=368;
        int ans=0;

        while(num>9){

            while(num>0){
                ans+=(num%10);
                num=num/10;
            }
            num=ans;
            ans=0;
        }
//        if(num == 0)
//            System.out.println("0");
//        else if(num % 9 == 0) {
//            System.out.println("9");
//        } n=num % 9;
        System.out.println(num);

    }
}
