package BALAJI;

import java.util.Scanner;

public class Type_casting {
    public static void main(String[] args){
        //INTEGER TO OTHER
        int a=65;
        int a1=256;
        float b=(float)(a);
        System.out.println("INT TO FLOAT-B : "+b);
        long c=(long)(a);
        System.out.println("INT TO LONG-C : "+c);
        double d=(double)(a);
        System.out.println("INT TO DOUBLE-D : "+d);
        byte e=(byte)(a1);
        System.out.println("INT TO BYTE-E : "+e);//256%256=0
        char f=(char)(a);
        System.out.println("INT TO CAHR-F : "+f);
        //FLOAT TO OTHER
        float g=65.0f;
        float g1=256.0f;
        int h=(int)(g);
        System.out.println("FLOAT TO INT-H : "+h);
        long i=(long)(g);
        System.out.println("FLOAT TO LONG-I : "+i);
        double j=(double)(g);
        System.out.println("FLOAT TO DOUBLE-J : "+j);
        byte k=(byte)(g1);
        System.out.println("FLOAT TO BYTE-K : "+k);
        char l=(char)(g);
        System.out.println("FLOAT TO CHAR-L : "+l);
        //LIKEWISE WE CAN CONVERT LONG TO OTHER,DOUBLE TO OTHER
        //BYTE TO OTHER
        byte m= 23;
        byte m1=65;
        int n=(int)(m);
        System.out.println("BYTE TO INT-N : "+n);
        float o=(float)(m);
        System.out.println("BYTE TO FLOAT-O : "+o);
        long p=(long)(m);
        System.out.println("BYTE TO LONG-P : "+p);
        double q=(double)(m);
        System.out.println("BYTE TO DOUBLE-Q : "+q);
        char r=(char)(m1);
        System.out.println("BYTE TO CHAR-R : "+r);
        //CHAR TO OTHER
        char s='A';
        int t=(int)(s);
        System.out.println("CHAR TO INT-T : "+t);
        float u=(float)(s);
        System.out.println("CHAR TO FLOAT-U : "+u);
        long v=(long)(s);
        System.out.println("CHAR TO LONG-V : "+v);
        double w=(double)(s);
        System.out.println("CHAR TO DOUBLE-W : "+w);
        byte x=(byte)(s);
        System.out.println("CHAR TO BYTE-K : "+x);
    }
}
