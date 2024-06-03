package STRING;

public class String_adding {
    public static void main(String[] args) {
        String alpha="";
        for(int i=0;i<26;i++){
            alpha+=(char)('a'+i);
        }
        System.out.println(alpha.toString());
        /*But the problem is that it creating new object for every iteration
        "a" , "ab" , "abc" , "abcd" ,.......................
        Because, strings are immutable in java
        So, for this we can use String Builder.
         */
    }
}
