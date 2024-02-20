class Solution {
    public int maxSubArray(int[] nums) {
        
        
        int overall_max=Integer.MIN_VALUE;
        int sum=0;
        
        for(int i=0; i<nums.length;i++){
            
            sum+=nums[i];
            overall_max= Math.max(sum, overall_max);
            
            if(sum<0){
                sum=0;
            }
        }
        
        return overall_max;
    }
}
