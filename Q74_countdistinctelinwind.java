package DSA;

import java.util.ArrayList;
import java.util.HashMap;

public class Q74_countdistinctelinwind {
   public static ArrayList<Integer> countDistinct(int a[],  int k)
    {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
        for(int i=0;i<k;i++){
            int temp;
            if(mp.containsKey(a[i])) temp = mp.get(a[i]);
            else temp = 0;
            mp.put(a[i], temp+1);
        }
        res.add(mp.size());
        for(int i=k;i<a.length;i++){
            int temp1 = mp.get(a[i-k]);
            mp.put(a[i-k], temp1-1);
            temp1 = mp.get(a[i-k]);
            if(temp1 == 0) mp.remove(a[i-k]);
            int temp;
            if(mp.containsKey(a[i])) temp = mp.get(a[i]);
            else temp = 0;
            mp.put(a[i], temp+1);
            res.add(mp.size());
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={1,2,1,3,4,2,3};
        int k=4;
        System.out.println(countDistinct(arr,k));
    }
}
