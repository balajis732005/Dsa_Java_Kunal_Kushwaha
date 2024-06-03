package STRING;

import java.util.Arrays;

public class String_Methods {
    public static void main(String[] args) {
        /*ALl the String Methods are not going to change, it will create the new object */
        String name="Balaji Java";
        char[] arr=name.toCharArray();
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        String low=name.toLowerCase();
        String high=name.toUpperCase();
        System.out.println();
        System.out.println(low);
        System.out.println(high);
        System.out.println(name.indexOf('a'));
        System.out.println("      Balaji        ".strip());
        System.out.println(Arrays.toString(name.split(" ")));
    }
}
