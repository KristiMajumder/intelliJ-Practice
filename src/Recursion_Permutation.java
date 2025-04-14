import java.util.*;
public class Recursion_Permutation {
    public static void main(String[] args) {
        String str="abc";
        List<String> ans=combinations("",str);
        System.out.println(ans);
    }
    public static List<String> combinations(String p,String up){
        List<String> allcombinations=new ArrayList<>();
        if(up.isEmpty()){
           allcombinations.add(p);
           return allcombinations;
        }
        char ch=up.charAt(0);
        for(int i=0;i<=p.length();i++){
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
          allcombinations.addAll(combinations(f+ch+l,up.substring(1)));
        }
        return allcombinations;
    }
}
