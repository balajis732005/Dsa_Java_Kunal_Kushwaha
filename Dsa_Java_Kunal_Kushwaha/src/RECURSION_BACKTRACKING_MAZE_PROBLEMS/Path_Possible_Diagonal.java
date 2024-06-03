package RECURSION_BACKTRACKING_MAZE_PROBLEMS;

import java.util.ArrayList;

public class Path_Possible_Diagonal {
    public static void main(String[] args) {
        PathDia("",0,0,2);
        System.out.println(PathRetDia("",0,0,2));
    }
    static void PathDia(String p,int r,int c,int e){
        if(r==e && c==e){
            System.out.println(p);
            return;
        }
        if(r<e && c<e){
            PathDia(p+"D",r+1,c+1,e);
        }
        if(r<e){
            PathDia(p+"H",r+1,c,e);
        }
        if(c<e){
            PathDia(p+"V",r,c+1,e);
        }
    }
    static ArrayList<String> PathRetDia(String p,int r,int c,int e){
        if(r==e && c==e){
            ArrayList<String> ans=new ArrayList<>();
            ans.add(p);
            return ans;
        }
        ArrayList<String> temp=new ArrayList<>();
        if(r<e && c<e){
            temp.addAll(PathRetDia(p+"D",r+1,c+1,e));
        }
        if(r<e){
            temp.addAll(PathRetDia(p+"H",r+1,c,e));
        }
        if(c<e){
            temp.addAll(PathRetDia(p+"V",r,c+1,e));
        }
        return temp;
    }
}