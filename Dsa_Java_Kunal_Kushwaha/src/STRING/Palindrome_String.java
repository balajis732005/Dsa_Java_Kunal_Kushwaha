package STRING;

import java.util.Scanner;

public class Palindrome_String {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=new String();
        System.out.print("Enter the String : ");
        str=in.nextLine();
        System.out.println("PALINDROME : "+ispalindrome(str));
    }
    static boolean ispalindrome(String str){
        if(str==null || str.length()==0){
            return true;
        }
        str = str.toLowerCase();
        for(int i=0;i<str.length()/2;i++){
            char start=str.charAt(i);
            char end=str.charAt(str.length()-1-i);
            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
