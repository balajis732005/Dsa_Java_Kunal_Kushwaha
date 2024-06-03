package TEMPERARY;

import java.util.Scanner;

public class Special_String {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            if(n%2==1){
                System.out.println("NO");
            }else{
                System.out.println("YES");
                for(int j=0;j<n/2;j++) {
                    System.out.print((char) (65 + j));
                    System.out.print((char) (65 + j));
                }
                System.out.println();
            }
        }
    }
}
