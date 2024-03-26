import java.util.*;

public class SlidingWindow {
   public static void main(String[] args) {
        String s = "abcabcbb";
        int a=0,b=0;
        int max=0;
        HashSet<Character> x=new HashSet();
        while(b<s.length()){
            if(!x.contains(s.charAt(b))){
                x.add(s.charAt(b));
                b++;
                max=Math.max(x.size(), max);
            }
            else{
                x.remove(a);
                a++;
            }
        }
        System.out.println(max);

    }
}


