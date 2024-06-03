package RECURSION_SUBSET;

import java.util.ArrayList;
import java.util.Scanner;

public class String_Subsequence_Ascii {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        subseqascii("",str);
        ArrayList<String> ans = subseqRetascii("",str);
        System.out.println(ans);
    }
    static void subseqascii(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseqascii(p + up.charAt(0) , up.substring(1));
        subseqascii(p,up.substring(1));
        subseqascii(p + (up.charAt(0)+0),up.substring(1));
    }
    static ArrayList<String> subseqRetascii(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> first=subseqRetascii(p + up.charAt(0),up.substring(1));
        ArrayList<String> second=subseqRetascii(p,up.substring(1));
        ArrayList<String> third=subseqRetascii(p + (up.charAt(0)+0),up.substring(1));
        first.addAll(second);
        first.addAll(third);
        return first;
    }
}
