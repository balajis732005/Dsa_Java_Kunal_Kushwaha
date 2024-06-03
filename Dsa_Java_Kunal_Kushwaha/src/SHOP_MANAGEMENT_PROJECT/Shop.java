package SHOP_MANAGEMENT_PROJECT;

public class Shop {
    public String[] Rack = new String[10];
    public int[] numbers = new int[10];
    public Shop(String[] ar1,int[] ar2) {
        for (int i = 0; i < 10; i++) {
            this.Rack[i] = ar1[i];
            this.numbers[i] = ar2[i];
        }
    }
    public void display_rack() {
        System.out.println("RACK NAMES : ");
        for (int i = 0; i < 10; i++) {
            System.out.println("RACK " + (i + 1) + " : " + Rack[i]);
        }
    }
    public void display_number(){
        System.out.println("AT THE INITIAL NUMBERS : ");
        for(int i=0;i<10;i++){
            System.out.println("RACK "+(i+1)+" : "+numbers[i]);
        }
    }
}
