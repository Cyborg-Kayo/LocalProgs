import java.util.*;

public class ValidSudoku {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        Arrays.sort(nums);
        Set<Integer> x=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(x.add(nums[i])){
                continue;
            }
        }
        String[] g = x.toArray(new String[x.size()]);
        for(String h:g){
            System.out.println(h);
        }
        // HashSet<Integer> y=new HashSet<>();
        // for(int j=0;j<g.length-2;j++){
        //     Integer a=Integer.parseInt(g[j]);
        //     Integer b=Integer.parseInt(g[j+1]);
        //     if(a+1==b){
        //         y.add(a);
        //     }
        //     else{
        //         y.clear();
        //     }

        // }
        // System.out.println(y.size()); 
    }
}
