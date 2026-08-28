class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> n1 = new HashSet<>();
        for(int i = 0;i<nums1.length;i++) n1.add(nums1[i]);
        HashSet<Integer> n2 = new HashSet<>();
        for(int i = 0;i<nums2.length;i++){
            if(n1.contains(nums2[i])) n2.add(nums2[i]);
        }
        int[] arr = new int[n2.size()];
        int i = 0;
        for(int nums:n2){
            arr[i++] = nums;
        }
        return arr;
    }
}