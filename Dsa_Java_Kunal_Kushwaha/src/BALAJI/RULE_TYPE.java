package BALAJI;

public class RULE_TYPE {
    public static void main(String[] args){
        short s=12;
        char c='A';
        byte b=112;
        int i=500;
        float f=12.56f;
        double d=123.35456;
        double result=(f*b)+(i/c)+(d*s);
        //FLOAT * BYTE = FLOAT
        //INT / CHAR = INT
        //DOUBLE * SHORT = DOUBLE
        //FLOAT + INT + DOUBLE = DOUBLE
        System.out.println((f*b)+"  "+(i/c)+"  "+(d*s));
        System.out.println("RESULT : "+result);
    }
}
