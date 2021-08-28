class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long sum = 0;
        long money2 = money;
        for(int i = 1;i<=count;i++){
            sum += price * i;
        }
        if(sum > money2){
            answer = sum - money2;
        }
        else if(sum <= money2){
            answer = 0;
        }
        return answer;
    }
}