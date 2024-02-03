import java.util.Vector;
public class implementingVectors{
    public static void main(String[]args){
        int n=5;
        Vector<Integer> v=new Vector<Integer>(n);
        for (int i=0;i<n;i++)
        v.add(i);
        System.out.println(v);
        v.remove(3);
        System.out.println(v);
        for (int i=0;i<v.size();i++)
        System.out.println(v.get(i)+" ");
        v.add(12);
        System.out.println(v);
        v.remove(2);
        System.out.println(v);
    }
}