package SHOP_MANAGEMENT_PROJECT;

import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String[] name1 = {"PRO1", "PRO2", "PRO3", "PR04", "PRO5", "PRO6", "PRO7", "PRO8", "PRO9", "PRO10"};
        int[] num1 = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
        String[] name2={"PRO1","PRO2","PRO3","PR04","PRO5","PRO6","PRO7","PRO8","PRO9","PRO10"};
        int[] num2={100,200,300,400,500,600,700,800,900,1000};
        String[] name3={"PRO1","PRO2","PRO3","PR04","PRO5","PRO6","PRO7","PRO8","PRO9","PRO10"};
        int[] num3={100,200,300,400,500,600,700,800,900,1000};
        String[] name4={"PRO1","PRO2","PRO3","PR04","PRO5","PRO6","PRO7","PRO8","PRO9","PRO10"};
        int[] num4={100,200,300,400,500,600,700,800,900,1000};
        String[] name5={"PRO1","PRO2","PRO3","PR04","PRO5","PRO6","PRO7","PRO8","PRO9","PRO10"};
        int[] num5={100,200,300,400,500,600,700,800,900,1000};
        boolean check=true;
        while(check){
            System.out.print("Enter the floor number(1-5) : ");
            int fn=in.nextInt();
            int rn,con;
            switch(fn){
                case 1:
                    Floor1 ob1=new Floor1(name1,num1);
                    System.out.println("AT INITIAL : ");
                    ob1.display_rack();
                    ob1.display_number();
                    System.out.print("SELECT THE RACK NUMBER(1-10) : ");
                    rn=in.nextInt();
                    System.out.print("SAY NUMBER OF COUNT WANT : ");
                    con=in.nextInt();
                    num1[rn-1]-=con;
                    System.out.println("AFTER SELECTION : ");
                    Floor1 ob12=new Floor1(name1,num1);
                    ob12.display_rack();
                    ob12.display_number();
                    break;
                case 2:
                    Floor2 ob2=new Floor2(name2,num2);
                    System.out.println("AT INITIAL : ");
                    ob2.display_rack();
                    ob2.display_number();
                    System.out.print("SELECT THE RACK NUMBER(1-10) : ");
                    rn=in.nextInt();
                    System.out.print("SAY NUMBER OF COUNT WANT : ");
                    con=in.nextInt();
                    num2[rn-1]-=con;
                    Floor1 ob22=new Floor1(name1,num1);
                    ob22.display_rack();
                    ob22.display_number();
                    break;
                case 3:
                    Floor3 ob3=new Floor3(name3,num3);
                    System.out.println("AT INITIAL : ");
                    ob3.display_rack();
                    ob3.display_number();
                    System.out.print("SELECT THE RACK NUMBER(1-10) : ");
                    rn=in.nextInt();
                    System.out.print("SAY NUMBER OF COUNT WANT : ");
                    con=in.nextInt();
                    num3[rn-1]-=con;
                    Floor1 ob32=new Floor1(name1,num1);
                    ob32.display_rack();
                    ob32.display_number();
                    break;
                case 4:
                    Floor4 ob4=new Floor4(name4,num4);
                    System.out.println("AT INITIAL : ");
                    ob4.display_rack();
                    ob4.display_number();
                    System.out.print("SELECT THE RACK NUMBER(1-10) : ");
                    rn=in.nextInt();
                    System.out.print("SAY NUMBER OF COUNT WANT : ");
                    con=in.nextInt();
                    num4[rn-1]-=con;
                    Floor1 ob42=new Floor1(name1,num1);
                    ob42.display_rack();
                    ob42.display_number();
                    break;
                case 5:
                    Floor5 ob5=new Floor5(name5,num5);
                    System.out.println("AT INITIAL : ");
                    ob5.display_rack();
                    ob5.display_number();
                    System.out.print("SELECT THE RACK NUMBER(1-10) : ");
                    rn=in.nextInt();
                    System.out.print("SAY NUMBER OF COUNT WANT : ");
                    con=in.nextInt();
                    num5[rn-1]-=con;
                    Floor1 ob52=new Floor1(name1,num1);
                    ob52.display_rack();
                    ob52.display_number();
                    break;
            }
            System.out.print("DO YOU WANT TO CONTINUE SHOPPING(1/0) : ");
            int s=in.nextInt();
            if(s==0){
                check=false;
            }
        }
        if(check==false){
            System.out.println("THANK YOU FOR SHOPPING!!!!");
        }
    }
}
