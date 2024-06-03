package RECURSION_SUBSET;

import java.util.Scanner;

public class String_Remove_String {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=in.nextLine();
        System.out.print("Enter the String : ");
        String re=in.nextLine();
        System.out.println("ANSWER : "+Remove_String(str,re));
    }
    static String Remove_String(String main,String sub){
        if(main.isEmpty()){
            return "";
        }
        if(main.startsWith(sub)){
            return Remove_String(main.substring(sub.length()),sub);
        }
        return main.charAt(0) + Remove_String(main.substring(1),sub);
    }
}
