class Solution {
    public int reverseBits(int n) {
        String s = "";
        for(int i = 0;i<32;i++){
            s += Integer.toString(n%2);
            n = n/2;
        }
        int ans = 0;
        for(int i = 0;i<32;i++){
            ans += Integer.parseInt(String.valueOf(s.charAt(i)))*Math.pow(2,31 - i);
        }
        return ans;
    }
}