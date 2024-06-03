package RECURSION_QUESTIONS;

import java.util.ArrayList;

public class Letter_Combination_of_Phone_Number_LC_17 {
    public static void main(String[] args) {
        pad("","23");
        System.out.println(padRet("","23"));
    }
    static void pad(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        int val=up.charAt(0)-'0';
        int s=(val-2)*3;
        if(val==8 || val==9){
            s++;
        }
        int e=(val*2)+(val-4);
        if(val==7 || val==8){
            e++;
        }
        if(val==9){
            e+=2;
        }
        for(int i=s;i<=e;i++){
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
        int s=(val-2)*3;
        if(val==8 || val==9){
            s++;
        }
        int e=(val*2)+(val-4);
        if(val==7 || val==8){
            e++;
        }
        if(val==9){
            e+=2;
        }
        ArrayList<String> temp=new ArrayList<>();
        for(int i=s;i<=e;i++){
            char ch=(char)('a'+i);
            temp.addAll(padRet(p+ch,up.substring(1)));
        }
        return temp;
    }
}
