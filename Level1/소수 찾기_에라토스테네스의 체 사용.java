import java.util.;
class Solution {
    public int solution(int n) {
        int answer = 0;

        ArrayListIntegerlist = new ArrayListInteger();
        boolean arr[] = new boolean[n+1];
        for(int i = 2;i=n;i++){
            if(arr[i] == false){
                answer++;
                for(int j = 1;ij=n;j++){
                    arr[ij] = true;
                }
            }
        }
        return answer;
    }
}