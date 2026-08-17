class Solution {
    public int countEven(int num) {
        int t = num;
        int digitSum = 0;
        while(t > 0){
            digitSum += t%10;
            t = t/10;
        }
        return (num - (digitSum%2))/2;
    }
}