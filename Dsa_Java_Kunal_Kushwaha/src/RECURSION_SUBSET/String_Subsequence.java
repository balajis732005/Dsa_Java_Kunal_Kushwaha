package RECURSION_SUBSET;

import java.util.Scanner;
import java.util.ArrayList;

public class String_Subsequence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        subseq("",str);
        ArrayList<String> ans = subseqRet("",str);
        System.out.println(ans);
    }
    static void subseq(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subseq(p + up.charAt(0) , up.substring(1));
        subseq(p,up.substring(1));
    }
    static ArrayList<String> subseqRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> left = subseqRet(p + up.charAt(0),up.substring(1));
        ArrayList<String> right = subseqRet(p , up.substring(1));
        left.addAll(right);
        return left;
    }
}