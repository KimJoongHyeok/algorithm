import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        Stack<Integer>s = new Stack<>();
        
        for(int i = 0;i<moves.length;i++){
            int move = moves[i]-1;
            for(int j = 0;j<board.length;j++){
                if(board[j][move] != 0){
                    //System.out.print(board[j][move] + " ");
                     if(s.size() != 0 && s.peek() == board[j][move]){
                         s.pop();
                         answer += 2;
                         board[j][move] = 0;
                         break;
                     }
                    else{
                        s.push(board[j][move]);
                        board[j][move] = 0;
                        break;   
                    }
                }
            }
        }
        
        return answer;
    }
}