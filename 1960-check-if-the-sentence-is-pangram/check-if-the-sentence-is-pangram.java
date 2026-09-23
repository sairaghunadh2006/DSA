class Solution {
    public boolean checkIfPangram(String sentence) {
        for(char a = 'a';a<='z';a++){
            if(sentence.indexOf(a) == -1) return false;
        }
        return true;
    }
}