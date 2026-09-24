class Solution {
    public static boolean reverse(String a){
        int i = 0,j = a.length() - 1;
        while(i<j){
            if(a.charAt(i) != a.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    public String firstPalindrome(String[] words) {
        for(int i = 0;i<words.length;i++){
            if(reverse(words[i])) return words[i];
        }
        return "";
    }
}