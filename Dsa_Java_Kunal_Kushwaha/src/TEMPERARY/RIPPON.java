package TEMPERARY;

import java.util.Scanner;

public class RIPPON {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();
            int m=in.nextInt();
            int k=in.nextInt();
            if(n>1 && m>1 && k<n && m!=k) {
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
            t--;
        }
    }
}
