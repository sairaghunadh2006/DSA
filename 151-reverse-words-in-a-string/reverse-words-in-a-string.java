class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String[] rs = s.split("\\s+");
        String ans = "";
        for(int i = rs.length - 1;i>=0;i--){
            ans += rs[i] + " ";
        }
        return ans.trim();
    }
}