class Solution {
    public boolean isPrefixString(String s, String[] words) {
        int index=0;
        for(String w: words){
            if(s.substring(index).startsWith(w)){
                index+=w.length();
                if(index==s.length()){
                    return true;
                }
            }
            else return false;
        }
        return index==s.length();
    }
}