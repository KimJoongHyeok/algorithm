class Solution {
    public boolean solution(int x) {

        int sum = 0;
        int a = x;
        while(x > 0){
            sum += x % 10;
            x /= 10;
        }
        if(a % sum == 0 ){
            return true;
        }
        return false;

    }
}