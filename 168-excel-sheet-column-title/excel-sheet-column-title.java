class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s = new StringBuilder();
        while(columnNumber > 0){
            columnNumber--;
            s.insert(0,(char)('A' + columnNumber%26));
            columnNumber /= 26;
        }
        return s.toString();
    }
}