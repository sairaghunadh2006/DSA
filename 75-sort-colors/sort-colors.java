class Solution {
    static void merge(int[] nums,int left,int mid,int right){
        int i = left;
        int j = mid + 1;
        int k = 0;
        int n = right - left + 1;
        int[] new_arr = new int[n];
        while(i<=mid && j<=right){
            if(nums[i] < nums[j]){
                new_arr[k++] = nums[i++];
            }
            else{
                new_arr[k++] = nums[j++];
            }
        }
        while(i<=mid){
            new_arr[k++] = nums[i++];
        }
        while(j <= right){
            new_arr[k++] = nums[j++];
        }
        for(int c = 0;c<n;c++){
            nums[left + c] = new_arr[c];
        }
    }
    static void mergeSort(int[] nums,int left,int right){
        if(left >= right) return;
        int mid = (left + right)/2;
        mergeSort(nums,left,mid);
        mergeSort(nums,mid + 1,right);
        merge(nums,left,mid,right);
    }
    public void sortColors(int[] nums) {
        mergeSort(nums,0,nums.length - 1);
    }
}