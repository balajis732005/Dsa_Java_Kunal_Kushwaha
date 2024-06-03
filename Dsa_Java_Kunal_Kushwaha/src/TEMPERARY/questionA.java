package TEMPERARY;

import java.util.Scanner;

public class questionA {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int m=in.nextInt();
            int k=in.nextInt();
            int[] arr1=new int[n];
            int[] arr2=new int[m];
            for(int j=0;j<n;j++){
                arr1[j]=in.nextInt();
            }
            for(int j=0;j<m;j++){
                arr2[j]=in.nextInt();
            }
            int count=0;
            for(int a=0;a<n;a++) {
                if (arr1[a] > k) {
                    continue;
                }
                for (int b = 0; b < m; b++) {
                    if (arr1[a] + arr2[b] <= k) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
