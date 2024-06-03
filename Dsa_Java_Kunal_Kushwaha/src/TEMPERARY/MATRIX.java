/*package TEMPERARY;

import java.util.Arrays;
import java.util.Scanner;

public class MATRIX {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t>0){
            int n=in.nextInt();
            int c=in.nextInt();
            int d=in.nextInt();
            int[] mat=new int[n];
            for(int i=0;i<n;i++){
                mat[i]=in.nextInt();
            }
            Arrays.sort(mat);
            int[] hash=new int[n];
            int order=n;
            boolean check=false;
            int[][] sqr=new int[n][n];
            while(order>0){
                if(check){
                    break;
                }
                int inner=n;
                while(inner>0){
                    int first=-1;
                    for(int i=0;i<n;i++){
                        if(hash[i]==0){
                            first=mat[i];
                            break;
                        }
                    }
                    if(first!=-1){
                        sqr[n-inner][0]=first;
                    }
                    for(int j=1;j<n;j++){
                        for(int )
                        if(inner==n){
                            //sqr[n-inner][j-1]+d)
                        }
                    }
                    inner--;
                }
                order--;
            }
            t--;
        }
    }
}
*/
