class Solution {
    public int minMoves2(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        int med = nums[nums.length/2];
        for(int i:nums){
            sum += Math.abs(i - med);
        }
        return sum;
    }
}