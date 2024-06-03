package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class DEPRECIATION_VALUE {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the amount PV : ");
        float pv=in.nextFloat();
        System.out.print("Enter the rate per year : ");
        float r=in.nextInt();
        System.out.print("Enter the years : ");
        float n=in.nextInt();
        float d=pv*power((1-(r/100)),n);
        System.out.println("DEPRECIATION VALUE FOR "+n+" YEARS : "+d);
    }
    static float power(float a,float p){
        float re=1;
        for(int i=0;i<p;i++){
            re*=a;
        }
        return re;
    }
}
