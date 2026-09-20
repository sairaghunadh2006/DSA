class Solution {
    public static void reverse(int[] a,int i,int j){
        while(i<j){
            int t = a[i];
            a[i] = a[j];
            a[j] = t;
            i++;
            j--;
        }
    }
    public void rotate(int[] nums, int k) {
        k = k%nums.length;
        reverse(nums,0,nums.length - k - 1);
        reverse(nums,nums.length - k,nums.length - 1);
        reverse(nums,0,nums.length - 1);
    }
}