package RECURSION_BACKTRACKING_MAZE_PROBLEMS;

import java.util.ArrayList;

public class Path_Possible {
    public static void main(String[] args) {
        Path("",0,0,2);
        System.out.println(PathRet("",0,0,2));
    }
    static void Path(String p,int r,int c,int e){
        if(r==e && c==e){
            System.out.println(p);
            return;
        }
        if(r<e){
            Path(p+"R",r+1,c,e);
        }
        if(c<e){
            Path(p+"D",r,c+1,e);
        }
    }
    static ArrayList<String> PathRet(String p,int r,int c,int e){
        if(r==e && c==e){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> temp=new ArrayList<>();
        if(r<e){
            temp.addAll(PathRet(p+"R",r+1,c,e));
        }
        if(c<e){
            temp.addAll(PathRet(p+"D",r,c+1,e));
        }
        return temp;
    }
}
