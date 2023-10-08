package DSA;

public class Q40_majorityelement {
    public static void main(String[] args) {
        int num[]={2,2,1,1,1,2,2};
        int count=0;
        int candidate=0;
        for (int i=0;i<num.length;i++){
            if (count==0){
                candidate=num[i];
            }
            if (num[i]==candidate){
                count++;
            }
            else {
                count--;
            }
        }
        System.out.println(candidate);
    }
}
