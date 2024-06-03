package STRING;

public class String_comparision {
    public static void main(String[] args){
        //created in the pool pointing to same object
        String a="java";
        String b="java";
        //created in outside of the pool and doesn't pointing to same object
        String c=new String("java");
        String d=new String("java");
        //Comparision (==) compare the location is equal or not and as well as object
        System.out.println("== between inside of pool: "+(a==b));
        System.out.println("== between outside of pool : "+(c==d));
        //Equals(.equal) compare only the objects or values or same or not
        System.out.println("EQUALS for A and B : "+(a.equals(b)));
        System.out.println("EQUALS for C and D : "+(c.equals(d)));
    }
}
