package STRING;

public class String_Builder {
    public static void main(String[] args) {
        StringBuilder alpha=new StringBuilder();
        for(int i=0;i<26;i++){
            alpha.append((char)('a'+i));
        }
        System.out.println(alpha);
        /*Here it will not create new object like String.It just appending the element.
        So, StringBuilders are Immutable in java.
         */
        alpha.deleteCharAt(0);
        for(int i=0;i<alpha.length();i++){
            System.out.print(alpha.charAt(i)+" ");
        }
        System.out.println();
        alpha.reverse();
        System.out.println(alpha);
    }
}
