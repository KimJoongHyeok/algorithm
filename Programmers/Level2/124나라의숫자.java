class Solution {
    public String solution(int n) {
        String []numbers = {"4","1","2"};
        String answer = "";
        int r = 0;
        int num = n;
        while(num > 0){
            r = num % 3;
            num /= 3;
            
            if(r == 0) num--;
            answer = numbers[r] + answer;
        }
        return answer;
    }
}