package DSA;

import java.util.Arrays;

public class Q78_spiralmatrix {
    public static boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())return false;
        char a[]=s.toCharArray();
        char b[]=t.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);
        for(int i=0;i<a.length;i++)
        {if(a[i]!=b[i])
        {
            return false;
        }
        }

        return true;
    }

    public static void main(String[] args) {
        String s="abhi";
        String v="bhai";
        System.out.println(isAnagram(s,v));
    }

}
