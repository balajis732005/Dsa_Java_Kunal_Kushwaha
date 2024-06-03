package INBUILT_METHODS_AND_FUNCTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Arrays;
import java.util.List;

public class ARRAY_LIST_CLASS {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        for(int i=0;i<10;i++){
            arr.add(i);
        }
        arr.add(7,23);
        System.out.println(arr.toString());
        System.out.println(arr.size());
        arr.add(6,-2);
        arr.add(5,-7);
        Collections.sort(arr);
        System.out.println(arr.toString());
        //arr.clear(); -> delete all the elements
        System.out.println(arr.toString());
        System.out.println(arr.isEmpty());
        arr.remove(7);
        System.out.println(arr.toString());
        System.out.println(arr.clone());
        System.out.println(arr.remove(7));
        System.out.println(arr.toString());
        System.out.println(arr.hashCode());
        arr.trimToSize();
        System.out.println(arr.toString());
        System.out.println(arr.contains(9));
        System.out.println(Arrays.toString(arr.toArray()));
        arr.add(4,5);
        arr.add(6,5);
        arr.add(7,5);
        System.out.println(arr.toString());
        System.out.println(arr.lastIndexOf(5));
        System.out.println(arr.subList(3,9).toString());
        ArrayList<String> gain=new ArrayList<>();
        gain.add("Apple");
        gain.add("Mango");
        gain.add("Orange");
        gain.add("Banana");
        gain.add("Dry fruit");
        System.out.println(gain);
        gain.remove(0);
        System.out.println(gain);
        gain.remove("Mango");
        System.out.println(gain);
        List<String> temp=Arrays.asList("Orange","Banana");
        gain.removeAll(temp);
        System.out.println(gain);
        System.out.println(gain.indexOf("Dry fruit"));
    }
}
