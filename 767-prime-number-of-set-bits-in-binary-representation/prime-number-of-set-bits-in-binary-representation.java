class Solution {
    static boolean prime(int n){
        if(n < 2) return false;
        boolean p = true;
        for(int i = 2;i*i<=n;i++){
            if(n%i == 0){
                p = false;
                break;
            }
        }
        return p;
    }
    public int countPrimeSetBits(int left, int right) {
       int c = 0;
       for(int i = left;i<=right;i++){
        if(prime(Integer.bitCount(i))) c++;
       }
       return c;
    }
}