class Solution {
    static int SetBits(int n){
        int c = 0;
        while(n > 0){
            if((n & 1) == 1) c++;
            n = n>>>1;
        }
        return c;
    }
    public int minBitFlips(int start, int goal) {
        return SetBits(start^goal);
    }
}