class Solution {
    public int minSubArrayLen(int target, int[] nums) {
            int n = nums.length;
            int minLength = Integer.MAX_VALUE;
            int left = 0;
            int currentLength = 0;
            int currentSum = 0;
            for (int right = 0; right < n; right++) {
                
                currentSum += nums[right];
                while(currentSum >= target){
                    currentLength = right - left + 1;
                    minLength = Math.min(minLength, currentLength);
                    currentSum -= nums[left];
                    left++;
                }                
            }
            return minLength == Integer.MAX_VALUE ? 0 : minLength;
        }
}