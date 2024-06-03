package CONDITIONAL_LOOPS;

import java.util.Scanner;

public class DISTANCE_BETWEEN_TWO_POINTS {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the point(x1,y1) : ");
        int x1=in.nextInt();
        int y1=in.nextInt();
        System.out.print("Enter the point(x2,y2) : ");
        int x2=in.nextInt();
        int y2=in.nextInt();
        float dis;
        if(x1==x2){
            if(y1>y2){
                dis=y1-y2;
            }
            else{
                dis=y2-y1;
            }
            System.out.println("DISTANCE : "+dis);
        }
        else if(y1==y2){
            if(x1>x2){
                dis=x1-x2;
            }
            else{
                dis=x2-x1;
            }
            System.out.println("DISTANCE : "+dis);
        }
        else{
            float adj,opp,hy;
            if(x1>x2){
                adj=x1-x2;
            }
            else{
                adj=x2-x1;
            }
            if(y1>y2){
                opp=y1-y2;
            }
            else{
                opp=y2-y1;
            }
            hy=sqrt((adj*adj),(opp*opp));
            System.out.println("DISTANCE : "+hy);
        }
    }
    static float sqrt(float a,float b){
        float real=a+b;
        float num=real/2.0f;
        float temp=0.0f;
        while(num!=temp){
            temp=num;
            num=((real/temp)+temp)/2.0f;
        }
        return num;
    }
}
