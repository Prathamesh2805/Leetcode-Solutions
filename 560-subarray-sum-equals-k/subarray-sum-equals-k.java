class Solution {
    public int subarraySum(int[] nums, int k) {
        int counter = 0;
        int totalSum = 0;
        Map<Integer, Integer> myMap = new HashMap<>();

        myMap.put(0, 1);

        for (int i = 0; i < nums.length; i++) {
            totalSum += nums[i];

            int requiredSum = totalSum - k;

            if (myMap.containsKey(requiredSum)) {
                counter += myMap.get(requiredSum);
            }

            myMap.put(totalSum, myMap.getOrDefault(totalSum, 0) + 1);
        }

        return counter;
    }
}
