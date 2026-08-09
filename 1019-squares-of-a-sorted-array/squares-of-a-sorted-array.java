class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1;
        int k = nums.length - 1;
        int[] result = new int[nums.length];
        while(i<=j){
            int s1 = nums[i]*nums[i];
            int s2 = nums[j]*nums[j];
            if(s1>s2){
                result[k] = s1;
                i++;
            }
            else{
                result[k] = s2;
                j--;
            }
            k--;
        }
        return result;
    }
}