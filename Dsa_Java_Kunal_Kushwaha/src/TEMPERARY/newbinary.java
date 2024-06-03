package TEMPERARY;

import java.util.Scanner;

public class newbinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt();
            String s = in.next();
            if(possible(s,n)){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static boolean possible(String s,int n){
        int one=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='1'){
                one++;
            }
        }
        if(one==0){
            return true;
        }
        if(one>=4 && one%2==0){
            return true;
        }
        else if(one==2){
            int ind1=s.indexOf('1');
            int ind2=s.lastIndexOf('1');
            if(ind2==(ind1+1)){
                return false;
            }else{
                return true;
            }
        }
        return false;
    }
}
