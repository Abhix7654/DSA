package DSA;

public class Q16_kthfactorofn {
    public static void main(String[] args) {

    int n=12;
    int k=3;

    int count = 0;
    int result = -1;
        for(int i=1; i<=n; i++) {
        if(n % i == 0) {
            count++;
            if(count == k) {
                result = i;
                break;
            }
        }
    }
        System.out.println(result);


//        //brute-force approach
//        List<Integer> list = new ArrayList<>(n);
//        for(int i=1; i<=n; i++) {
//            if(n % i == 0){
//                list.add(i);
//            }
//        }
//        if (k <= list.size()) {
//            return list.get(k - 1);
//        } else {
//            return -1;
//        }
}}
