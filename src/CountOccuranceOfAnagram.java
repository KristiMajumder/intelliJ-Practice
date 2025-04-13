import java.util.*;

public class CountOccuranceOfAnagram {
    public static void main(String[] args) {
        String str="foaxborfaofr";
        String given="for";
        int ans=check(str,given);
        System.out.println(ans);
    }
    public static int check(String str,String given){
        int ans=0;
        Map<Character,Integer> map=new HashMap<>();
        for(int i=0;i<given.length();i++){
            if(map.containsKey(given.charAt(i))){
                map.put(given.charAt(i),map.get(given.charAt(i))+1);
            }
            else{
                map.put(given.charAt(i),1);
            }
        }
        int count=map.size();

        int i=0;
        int j=0;
        int k=count;

        while(j<str.length()){
            char key=str.charAt(j);
            if(map.containsKey(key)){
                map.put(key,map.get(key)-1);
                if(map.get(key)==0){
                    count--;
                }
            }
            if(j-i+1<k){
                j++;
            }
            else if(j-i+1==k){
                if(count==0){
                    ans++;
                }

                char ikey=str.charAt(i);
                if(map.containsKey(ikey)){
                    map.put(ikey,map.get(ikey)+1);
                    if(map.get(ikey)==1){
                        count++;
                    }
                }
                i++;
                j++;
            }
        }
        return ans;
    }
}
