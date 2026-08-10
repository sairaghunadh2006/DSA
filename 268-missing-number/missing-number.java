class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        long orginal_sum = (long)(n*(n + 1))/2;
        long nums_sum = 0;
        for(int num:nums){
            nums_sum += num;
        }
        return (int)(orginal_sum - nums_sum);
    }
}