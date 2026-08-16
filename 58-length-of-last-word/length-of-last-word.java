class Solution {
    public int lengthOfLastWord(String s) {
        String a = s.trim();
        String[] res = a.split("\\s+");
        return res[res.length - 1].length();
    }
}