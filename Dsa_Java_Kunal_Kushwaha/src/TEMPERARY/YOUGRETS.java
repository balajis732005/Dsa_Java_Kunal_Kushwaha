package TEMPERARY;

import java.util.Scanner;

public class YOUGRETS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();
            int a=in.nextInt();
            int b=in.nextInt();
            int first=n*a;
            int second=0;
            while(n>1){
                second+=b;
                n-=2;
            }
            if(n==1){
                second+=a;
            }
            if(first<second){
                System.out.println(first);
            }else{
                System.out.println(second);
            }
            t--;
        }
    }
}
