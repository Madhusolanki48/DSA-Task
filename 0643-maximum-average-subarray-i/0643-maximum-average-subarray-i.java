class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int len = nums.length;
        int sum=0;
        for(int i =0;i<k; i++){
            sum+= nums[i];
        }
        double maxAvg= (double)sum/k;
        for(int j=k; j<len; j++){
            sum+= nums[j] - nums[j-k];
            maxAvg= Math.max(maxAvg, (double)sum/k);
        }
        return maxAvg;
    }
}