class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";
        if(strs.length == 1) return strs[0];
        int k = 0;
        while(true){
            for(int i = 1;i<strs.length;i++){
                if(strs[i].length() == k || k == strs[0].length()){
                    return strs[0].substring(0,k);
                }
                if(strs[i].charAt(k) != strs[0].charAt(k)){
                    return strs[0].substring(0,k);
                }
            }
            k += 1;
        }
    }
}