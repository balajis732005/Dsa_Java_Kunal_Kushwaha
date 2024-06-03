package RECURSION_QUESTIONS;

import java.util.ArrayList;
import java.util.Scanner;

public class Letter_Phone_Comb_Basic_Model {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String str=in.nextLine();
        pad("",str);
        System.out.println(padRet("",str));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int val=up.charAt(0)-'0';
        for(int i=(val-1)*3;i<val*3;i++){
            char ch=(char)('a'+i);
            pad(p+ch,up.substring(1));
        }
    }
    static ArrayList<String> padRet(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        int val=up.charAt(0)-'0';
        ArrayList<String> tem=new ArrayList<>();
        for(int i=(val-1)*3;i<val*3;i++){
            char ch=(char)('a'+i);
            tem.addAll(padRet(p+ch,up.substring(1)));
        }
        return tem;
    }
}