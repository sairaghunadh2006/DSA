class Solution {
    public String maxSumOfSquares(int num, int sum) {
        if(sum > num*9) return "";
        StringBuilder res = new StringBuilder();
        int nines = sum/9;
        int rem = sum%9;
        res.append("9".repeat(nines));
        if(rem > 0) res.append(rem);
        res.append("0".repeat(num - res.length()));
        return res.toString();
    }
}