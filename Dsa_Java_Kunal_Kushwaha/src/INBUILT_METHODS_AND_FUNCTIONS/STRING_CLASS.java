package INBUILT_METHODS_AND_FUNCTIONS;

import java.util.Arrays;

public class STRING_CLASS {
    public static void main(String[] args) {
        String str="Hiambalajistobecomeancoderjava";
        System.out.println(str.length());
        System.out.println(str.charAt(6));
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());
        System.out.println(str.substring(5));
        System.out.println(str.isEmpty());
        System.out.println(Arrays.toString(str.toCharArray()));
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("balaji"));
        System.out.println(str.substring(2,8));
        String a="an de fr vu hiked chdicuhj cue uiceibci";
        System.out.println(Arrays.toString(a.split(" ")));
        String b="                balaji                  ";
        b=b.strip();
        System.out.println(b);
        System.out.println(b.startsWith(b));
        System.out.println(b.codePointAt(2));
        System.out.println(b.compareTo(a));
        /*
         An int value: 0 if the string is equal to the other string.
        < 0 if the string is lexicographically less than the other string
        > 0 if the string is lexicographically greater than the other string (more characters)
         */
        System.out.println(b.concat(a));
        System.out.println(b.endsWith("ji"));
        System.out.println(b.repeat(4));
        System.out.println(b.replace('a','@'));
        System.out.println(b.replaceAll("ba","la"));
        System.out.println(b.replaceFirst("a","@"));
        System.out.println(str.subSequence(2,7));
        String n="232";
        int num=Integer.parseInt(n);
        System.out.println(num);
        int fun='2'-'0';
        System.out.println(fun);
        int main=79843;
        String gate=Integer.toString(main);
        System.out.println(gate);
    }
}
