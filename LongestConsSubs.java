import java.util.*;

public class LongestConsSubs {
    public static void main(String[] args) {
        int[] nums = {-8,-4,9,9,4,6,1,-4,-1,6,8};
        Arrays.sort(nums);
        System.out.println(nums.toString());
        ArrayList<Integer> x=new ArrayList<>();

        for(int i:nums){
            x.add(i);
        }
        int max=0;
        for(int i=0;i<x.size();i++){
            int cur=0;
            int a=0;
            while(x.contains(nums[i]+a)!=false){
                cur++;
                a++;
                max=Math.max(max,cur);
            }
        }
        System.out.println(max);
        
    }
    
}
