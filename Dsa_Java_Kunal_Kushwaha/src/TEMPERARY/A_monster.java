package TEMPERARY;

import java.util.Scanner;

public class A_monster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int t = in.nextInt();
            int h = in.nextInt();
            int[] fir = new int[t];
            int[] sec = new int[t];
            for (int j = 0; j < t; j++) {
                fir[j] = in.nextInt();
            }
            for (int k = 0; k < t; k++) {
                sec[k] = in.nextInt();
            }
            System.out.println(ways(t, h, fir, sec));
        }
    }
    static int ways(int t,int h,int[] fir,int[] sec){
        int count=0;
        for(int i=0;i<t;i++){
            for(int j=0;j<t;j++){
                if((fir[i]^sec[j]) == (h^(i+1)^(j+1))){
                    count++;
                }
            }
        }
        return count;
    }
}
