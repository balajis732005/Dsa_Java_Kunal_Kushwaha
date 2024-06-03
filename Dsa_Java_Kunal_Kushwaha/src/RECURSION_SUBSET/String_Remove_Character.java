package RECURSION_SUBSET;

import java.util.Scanner;

public class String_Remove_Character {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=in.nextLine();
        System.out.print("Enter the character : ");
        char c=in.next().charAt(0);
        System.out.println("ANSWER BY METHOD 1 : "+Remove_char1(str,c));
        System.out.println("ANSWER BY METHOD 2 : "+Remove_char2(str,c));
    }
    static String Remove_char1(String str,char ch){
        StringBuilder ans=new StringBuilder();
        return helper(str,ans,ch,0).toString();
    }
    static StringBuilder helper(String str,StringBuilder ans,char ch,int ind){
        if(ind==str.length()){
            return ans;
        }
        if(str.charAt(ind)!=ch){
            ans.append(str.charAt(ind));
            return helper(str,ans,ch,ind+1);
        }
        return helper(str,ans,ch,ind+1);
    }
    static String Remove_char2(String str,char ch){
        if(str.isEmpty()){
            return "";
        }
        if(str.charAt(0)==ch){
            return Remove_char2(str.substring(1),ch);
        }
        return str.charAt(0) + Remove_char2(str.substring(1),ch);
    }
}
