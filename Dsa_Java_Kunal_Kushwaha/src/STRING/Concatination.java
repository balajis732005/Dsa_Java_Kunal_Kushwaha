package STRING;

import java.util.ArrayList;

public class Concatination {
    public static void main(String[] args) {
        System.out.println('a' + 'b');
        System.out.println("a" + "b");
        System.out.println('a' + 3);
        System.out.println((char)('a' + 3));
        System.out.println("a" + 1);
        //Here 1 of int is converted in to wrapper class "Integer" and call .toString() Method
        //---> "a" + "1"
        System.out.println("balaji" + new ArrayList<>());
        //ArrayList calls .toString() Method
        System.out.println("java" + new Integer(73));
        // --> "java" + "73"
    }
}
