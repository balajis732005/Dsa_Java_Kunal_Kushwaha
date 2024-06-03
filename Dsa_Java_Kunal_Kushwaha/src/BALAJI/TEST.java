package BALAJI;
import java.util.Arrays;

public class TEST {
    public int a=10;

    public static void main(String[] args) {
        /*
        TEST ob=new TEST();
        private ob.a=20;
        System.out.println(ob.a);
        StringBuilder[] sen={"idj hid uh","njl hdj","jhsgu bh hgxyu hgddyu"};
            System.out.println(Arrays.toString(sen));

         */
        int[] index={0,1,2,2,1};
        int[] nums={0,1,2,3,4};
        int n=index.length;
        int[] target=new int[n];
        int a=0;
        for(int i=0;i<n;i++){
            if(index[i]<a){
                for(int j=a;i>index[i];j--){
                    target[j+1]=target[j];
                }
                target[index[i]]=nums[i];
                a++;
            }
            else{
                target[index[i]]=nums[i];
                a++;
            }
        }
        System.out.println(Arrays.toString(target));
    }
}
