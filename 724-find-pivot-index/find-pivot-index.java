class Solution {
    public int pivotIndex(int[] nums) {

        for (int pointer = 0; pointer < nums.length; pointer++) {
            int leftSum = 0;
            int rightSum = 0;
            for (int i = 0; i < pointer; i++) {
                leftSum += nums[i];
            }
            for (int i = pointer + 1; i < nums.length; i++) {
                rightSum += nums[i];
            }

            if (leftSum == rightSum) {
                return pointer;
            }
        }
        return -1;
    }
}