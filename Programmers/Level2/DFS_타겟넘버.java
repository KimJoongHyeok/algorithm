import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) {

        int answer = dfs(numbers,0,0,target);

        return answer;
    }
    
    public static int dfs(int []numbers,int depth,int sum,int target) {
      if(depth == numbers.length){
          if(sum == target) return 1;
          else return 0;
      }else{
          return dfs(numbers,depth+1,sum+numbers[depth],target) + dfs(numbers,depth+1,sum-numbers[depth],target);  
        }
    }
}