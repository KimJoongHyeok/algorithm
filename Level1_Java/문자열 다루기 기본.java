class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        
        int length = s.length();
        
        if(length == 4 || length == 6){
            for(int i = 0;i<length;i++){
                char ch = s.charAt(i);
                if(ch < '0' || ch > '9') return false;
            }
            return true;
        }
        else return false;
        
        //return answer;
    }
}