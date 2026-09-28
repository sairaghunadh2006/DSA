class Solution {
    public int maxDepth(String s) {
        int c = 0;
        int m = 0;
        for(char a:s.toCharArray()){
            if(a == '('){
                c++;
                if(c>m) m = c;
            }
            else if(a == ')') c--;
        }
        return m;
    }
}