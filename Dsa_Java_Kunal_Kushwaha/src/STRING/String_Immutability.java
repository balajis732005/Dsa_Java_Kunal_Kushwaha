package STRING;

public class String_Immutability {
    public static void main(String[] args) {
        //STRING ARE IMMUTABLE
        /*WHY IMMUTABLE ? IF 5 VARIABLES ARE ASSIGNED TO SAME OBJECT THE IF ONE VARIABLE CHANGED MEANSE THEN OTHER 4 WILL ALSO CHANGED*/
        String name="kunal";
        String a="balaji";
        String b=a;
        a="newjava"; //Here I am not changing , I just crested new object and assign to it
        System.out.println("A : "+a);
        System.out.println("B : "+b);

        String now=null;
        System.out.println(now);
    }
}
