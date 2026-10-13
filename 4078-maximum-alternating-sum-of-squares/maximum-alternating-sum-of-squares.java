class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i = 0;i<nums.length;i++){
            nums[i] = Math.abs(nums[i]);
        }
        Arrays.sort(nums);
        long ans = 0L;
        int i = 0,j = nums.length - 1;
        while(i<j){
            ans -= nums[i]*nums[i];
            ans += nums[j]*nums[j];
            i++;
            j--;
        }
        if(i == j) ans += nums[i]*nums[i];
        return ans;
    }
}