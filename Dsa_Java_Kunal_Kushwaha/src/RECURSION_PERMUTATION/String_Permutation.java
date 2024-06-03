package RECURSION_PERMUTATION;

import java.util.ArrayList;
import java.util.Scanner;
//COUNT OF PERMUTATION -> N! WHERE N=LENGTH OF INPUT
public class String_Permutation {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        permutation("",str);
        System.out.println(permutationRet("",str));
    }
    static void permutation(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            permutation(first+up.charAt(0)+second,up.substring(1));
        }
    }
    static ArrayList<String> permutationRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> list=new ArrayList<>();
        for(int i=0;i<=p.length();i++){
            String first=p.substring(0,i);
            String second=p.substring(i,p.length());
            list.addAll(permutationRet(first+up.charAt(0)+second,up.substring(1)));
        }
        return list;
    }
}
