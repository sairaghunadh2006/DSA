class Solution {
    static int product(int n){
        int p = 1;
        while(n>0){
            p *= n%10;
            n = n/10;
        }
        return p;
    }
    public int smallestNumber(int n, int t) {
        if(product(n)%t == 0) return n;
        while(true){
            n = n + 1;
            int p = product(n);
            if(p%t == 0) break;
        }
        return n;
    }
}