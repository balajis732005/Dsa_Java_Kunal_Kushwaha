package RECURSION_QUESTIONS;

import java.util.ArrayList;

public class Die_Combinations {
    public static void main(String[] args) {
        diecom("",4);
        System.out.println(diecomRet("",4));
        System.out.println(diecomfaceRet("",8,8));
    }
    static void diecom(String p,int target){
        if(target==0){
            System.out.println(p);
            return;
        }
        for(int i=1;i<=target;i++){
            diecom(p+i,target-i);
        }
    }
    static ArrayList<String> diecomRet(String p,int target){
        if(target==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> temp=new ArrayList<>();
        for(int i=1;i<=target;i++){
            temp.addAll(diecomRet(p+i,target-i));
        }
        return temp;
    }
    static ArrayList<String> diecomfaceRet(String p,int target,int face){
        if(target==0){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> temp=new ArrayList<>();
        for(int i=1;i<=face && i<=target;i++){
            temp.addAll(diecomfaceRet(p+i,target-i,face));
        }
        return temp;
    }
}
