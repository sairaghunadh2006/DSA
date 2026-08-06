class Solution {
    public int reverse(int n) {
       int x = 0;
		while(n != 0){
            if(x>Integer.MAX_VALUE/10 || x<Integer.MIN_VALUE/10){
                return 0;
            }
		    x = x*10 + n%10;
		    n = n/10;
		}
        return x;
    }
}