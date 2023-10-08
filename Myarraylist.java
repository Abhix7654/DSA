package DSA;

public class Myarraylist {
    Integer data[];
    int index;
    public Myarraylist() {
        data = new Integer[16];
        index =0;

    }
    public Myarraylist(int initialCapacity) {
        data = new Integer[initialCapacity];
        index =0;
    }
    public void add(int element){
        if(data.length==index){
            Integer temp[]=new Integer[data.length *2];
            for (int i=0;i<data.length;i++){
                temp[i]=data[i];
            }
            data=temp;
        }
        data[index++]=element;
    }
    public int size(){
        return index;
    }
    public String toString(){
        StringBuilder res=new StringBuilder();
        for (int i=0;i< data.length;i++){
            res.append(data[i]+" ");
        }
        return res.toString();

    }

}
