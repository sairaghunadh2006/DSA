class Solution {
    public boolean isAnagram(String s, String t) {
        char[] s_a = s.toCharArray();
        char[] t_a = t.toCharArray();
        Arrays.sort(s_a);
        Arrays.sort(t_a);
        if(Arrays.equals(s_a,t_a)) return true;
        return false;
    }
}