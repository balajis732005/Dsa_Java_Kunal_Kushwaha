package TEMPERARY;

import java.util.Scanner;
/*
7
5
1 3 5 5 2
5
2 4 4 5 1
5
0 1 3 3 1
6
5 6 0 2 3 0
4
1 2 7 2
3
7 1 0
4
1 1 1 1
 */
public class questionB {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int n=in.nextInt();
            int[] arr=new int[n];
            for(int j=0;j<n;j++) {
                arr[j] = in.nextInt();
            }
            boolean main=false;
            boolean ch=false;
            //System.out.println(0<0);
            //System.out.println(false || false || false);
            while(!ch && sum(arr)>0){
                int count=0;
                for(int a=1;a<arr.length-1;a++) {
                    if(((arr[a-1]-1)<0) || ((arr[a]-2)<0) || ((arr[a+1]-1)<0)){
                        if(sum(arr)==0){
                            break;
                        }else if(main){
                            ch=true;
                            break;
                        }
                        count++;
                        //System.out.println(1);
                        //System.out.println(Arrays.toString(arr));
                        continue;
                    }
                    arr[a - 1]--;
                    arr[a]--;
                    arr[a]--;
                    arr[a + 1]--;
                    //System.out.println(Arrays.toString(arr));
                    if(sum(arr)==0){
                        break;
                    }
                }
                if(count==n-2){
                    main=true;
                }
            }
            if(sum(arr)==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
    static int sum(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans+=arr[i];
        }
        return ans;
    }
}