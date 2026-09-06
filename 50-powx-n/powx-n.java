class Solution {
    public double myPow(double x, int n) {
        long pow = n;
        if(pow<0){
            x = 1/x;
            pow = -pow;
        }
        double ans = 1.0;
        while(pow>0){
            if(pow%2 == 1){
                ans = ans*x;
                pow = pow - 1;
            }
            else{
                pow = pow/2;
                x = x*x;
            }
        }
        return ans;
    }
}