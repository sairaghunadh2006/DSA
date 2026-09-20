class Solution {
    public int reverseDegree(String s) {
        int res = 0;
        for(int i = 0;i<s.length();i++){
            int rd = 'z' - s.charAt(i) + 1;
            res += rd*(i + 1);
        }
        return res;
    }
}