class Solution {
    public int titleToNumber(String columnTitle) {
        int res = 0;
        for(char l:columnTitle.toCharArray()){
            res = res*26 + (l - 'A' + 1);
        }
        return res;
    }
}