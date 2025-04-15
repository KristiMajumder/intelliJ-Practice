import java.util.*;
public class MazeProblemPrintThePath {
    public static void main(String[] args) {

        List<String> ans=allPaths("",0,0);
        System.out.println(ans);
    }
    public static List<String> allPaths(String p,int r,int c){
        List<String> paths=new ArrayList<>();
        if(r==2&&c==2){
            paths.add(p);
            return paths;
        }
        if(r<2){
            paths.addAll(allPaths(p+'D',r+1,c));
        }
        if(c<2){
            paths.addAll(allPaths(p+'R',r,c+1));
        }

        return paths;
    }
}
