package RECURSION_BACKTRACKING_MAZE_PROBLEMS;

public class Ways_Possible {
    public static void main(String[] args) {
        System.out.println(posway(0,0,2));
    }
    static int posway(int r,int c,int e){
        if(r==e || c==e){
            return 1;
        }
        int right=posway(r,c+1,e);
        int down=posway(r+1,c,e);
        return right+down;
    }
}
