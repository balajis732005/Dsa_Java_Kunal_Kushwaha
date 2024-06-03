package BINARY_SEARCH_QUESTIONS;

import java.util.Scanner;

public class Search_in_string {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String name=in.nextLine();
        System.out.print("Enter the character : ");
        char c=in.next().charAt(0);
        System.out.print("Character found in the string : "+search_char(name,c));
    }
    static boolean search_char(String name,char target){
        if(name.length() == 0){   //For string only we are using the length() function
            return false;
        }
        for(char ch:name.toCharArray()){    //We convert that String in to character array
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
