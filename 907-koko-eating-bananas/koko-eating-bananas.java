class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int minSpeed = 1;
        int maxSpeed = 0;
        for(int i:piles){
            if(i>maxSpeed) maxSpeed = i;
        }
        while(minSpeed < maxSpeed){
            int mid = minSpeed + (maxSpeed - minSpeed)/2;
            if(eatTime(piles,h,mid)){
                maxSpeed = mid;
            }
            else{
                minSpeed = mid + 1;
            }
        }
        return minSpeed;
    }
    public boolean eatTime(int[] p,int h,int k){
        int hours = 0;
        for(int i:p){
            hours += (int)Math.ceil((double)i/k);
        }
        return hours <= h;
    }
}