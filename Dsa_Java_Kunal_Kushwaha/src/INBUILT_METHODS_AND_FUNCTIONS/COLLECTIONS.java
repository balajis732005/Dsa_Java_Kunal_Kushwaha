package INBUILT_METHODS_AND_FUNCTIONS;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class COLLECTIONS{
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        for(int i=1;i<=10;i++){
            list.add(i);
        }
        Collections.sort(list);
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
    }
}
