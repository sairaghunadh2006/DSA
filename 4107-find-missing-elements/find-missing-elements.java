class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Set<Integer> s = new HashSet<>();
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int ele: nums){
            s.add(ele);
            if(ele<min) min = ele;
            if(ele>max) max = ele;
        }
        List<Integer> res = new ArrayList<>();
        for(int i = min;i<=max;i++){
            if(!s.contains(i)) res.add(i);
        }
        return res;
    }
}
// Arrays.sort(nums);
// List<Integer> l = new ArrayList<>();
// for(int i = 0;i<nums.length;i++){
//     l.add(nums[i]);
// }
// List<Integer> res = new ArrayList<>();
// int n = nums[0];
// while(n < nums[nums.length - 1]){
//     if(!l.contains(n)) res.add(n);
//     n++;
// }
// return res;