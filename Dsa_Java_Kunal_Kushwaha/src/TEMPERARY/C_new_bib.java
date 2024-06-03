package TEMPERARY;

import java.util.Scanner;

public class C_new_bib {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[][] arr=new int[n][2];
        for(int i=0;i<n;i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<n;i++) {
            int x = (arr[i][0] + arr[i][1]) / 2;
            int y = x - arr[i][1];
            if (x >= 0 && y >= 0 && x + y == arr[i][0] && x - y == arr[i][1]) {
                System.out.print(x + " " + y);
            } else {
                System.out.print(-1);
            }
            System.out.println();
        }
    }
}
