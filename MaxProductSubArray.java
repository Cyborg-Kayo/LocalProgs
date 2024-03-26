public class MaxProductSubArray {
    public static void main(String[] args) {
        int[] nums = {2,3,-2,4};
        int max=Integer.MIN_VALUE;
        int i=0,j=1;
        int mul=nums[0];
        while(j<nums.length){
            mul=mul*nums[j];
            max=Math.max(mul, max);
            if(max<mul){
                
            }

            
        }
    }
    
}
