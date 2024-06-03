package MATH_FOR_DSA;

public class Single_occurrence_number {
    public static void main(String[] args){
        int[] arr={2,2,1,1,7,7,5,6,6,8,8,9,9}; // 5 is occurred only once that iss our answer
        System.out.println("SINGLE OCCURRENCE : "+exor_of_array(arr));
    }
    static int exor_of_array(int[] arr){
        int ans=0;
        for(int n:arr){
            ans = ans ^ n;
        }
        return ans;
    }
}
