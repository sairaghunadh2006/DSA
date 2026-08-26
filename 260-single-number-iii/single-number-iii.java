class Solution {
    public int[] singleNumber(int[] nums) {
        int x = 0;
        for(int i = 0;i<nums.length;i++){
            x^=nums[i];
        }
        int rm = (x^(x - 1))&x;
        int b1 = 0;
        int b2 = 0;
        for(int i = 0;i<nums.length;i++){
            if((nums[i]&rm) != 0) b1^=nums[i];
            else b2^=nums[i];
        }
        int[] arr = {b1,b2};
        return arr;
    }
}