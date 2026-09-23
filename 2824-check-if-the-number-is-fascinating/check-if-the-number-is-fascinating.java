class Solution {
    public boolean isFascinating(int n) {
        int[] arr = new int[10];
        for(int i = 1;i<=3;i++){
            int v = n*i;
            while(v>0){
                int l = v%10;
                if(i == 0) return false;
                if(arr[l] == 1){
                    return false;
                }
                else{
                    arr[l] = 1;
                }
                v = v/10;
            }
        }
        for(int i = 1;i<10;i++){
            if(arr[i] == 0) return false;
        }
        return true;
    }
}