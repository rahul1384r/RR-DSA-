import java.util.*;
public class arrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(100);
        list.add(1000);
        int arr[]={1,2,3,4};
        System.out.println(arr);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(10));
    }
}
