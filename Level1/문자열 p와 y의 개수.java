class Solution {
    boolean solution(String s) {
        boolean answer = true;
        
        int p = 0;
        int y = 0;
        
        char arr[] = s.toCharArray();
        
        for(int i = 0;i<arr.length;i++){
            if(arr[i] == 'p' || arr[i] == 'P') p++;
            else if(arr[i] == 'y' || arr[i] == 'Y') y++;
        }
        
        if(p == y){
            answer = true;
        }
        else{
            answer = false;
        }



        return answer;
    }
}