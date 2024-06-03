package ARRAY;

import java.util.ArrayList;
import java.util.List;

public class UNION_TWO_SORTED_ARRAY {
    public static void main(String[] args) {
        int[] a={1,2,3,3};
        int[] b={2,2,4};
        int i=0;
        int j=0;
        int k=0;
        List<Integer> ans=new ArrayList<>();
        while(i<a.length && j<b.length){
            if(ans.size()==0){
                if(a[i]<=b[j]){
                    ans.add(a[i]);
                    k++;
                    i++;
                }else{
                    ans.add(b[j]);
                    k++;
                    j++;
                }
            }else if(a[i]<=b[j]){
                if(ans.get(k-1)!=a[i]){
                    ans.add(a[i]);
                    k++;
                }
                i++;
            }else{
                if(ans.get(k-1)!=b[j]){
                    ans.add(b[j]);
                    k++;
                }
                j++;
            }
        }
        while(i<a.length){
            if(ans.get(k-1)!=a[i]){
                ans.add(a[i]);
                k++;
            }
            i++;
        }
        while(j<b.length){
            if(ans.get(k-1)!=b[j]){
                ans.add(b[j]);
                k++;
            }
            j++;
        }
        System.out.println(ans);
    }
}
