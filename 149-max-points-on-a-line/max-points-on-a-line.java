class Solution {
    public int maxPoints(int[][] points) {
        int n = points.length;
        if(n < 3) {
            return n;
        }
        int maxCount = 2;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int count = 2;
                for(int k=0; k<n; k++) {
                    if(k == i || k == j) {
                        continue;
                    }
                    int d = (points[j][1] - points[i][1]) * (points[k][0] - points[i][0]) - (points[k][1] - points[i][1]) * (points[j][0] - points[i][0]);
                    if(d == 0) {
                        count++;
                    }
                }
                maxCount = Math.max(maxCount, count);
            }
        }
        return maxCount;
    }
}