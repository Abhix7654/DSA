package DSA;

import java.util.Arrays;

public class Q24_revrsestrig {
    public static void main(String[] args) {
//        String s="qwerty";
//        String c="";
//        int v=s.length();
//        while (v!=0){
//            c=c+s.charAt(v-1);
//            v--;
//
//
//        }
        char arr[]={'q','w','e','r','t','y'};
        for (int i=0;i<arr.length/2;i++)
            for (int j= arr.length-1;j>=arr.length/2;j--){
                char temp=' ';
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
            }

        System.out.println(Arrays.toString(arr));
    }
}
