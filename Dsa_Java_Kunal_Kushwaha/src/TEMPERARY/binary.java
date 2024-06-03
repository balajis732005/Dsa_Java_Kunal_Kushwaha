package TEMPERARY;

import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            String s=in.next();
            char[] ar=s.toCharArray();
            int p1=0;
            int p2=n-1;
            while (p1 < p2) {
                if(ar[p1]=='0') {
                    p1++;
                    continue;
                }
                if(ar[p2]=='0'){
                    p2--;
                    continue;
                }
                if(p1<p2){
                    ar[p1]='0';
                    p1++;
                    ar[p2]='0';
                    p2--;
                }
            }
            if(ar[p1]=='1' || ar[p2]=='1'){
                System.out.println("NO");
            }else {
                System.out.println("YES");
            }
        }
    }
}