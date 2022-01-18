import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //int[] answer = {};
        Queue<Integer> q = new LinkedList<>();
        List<Integer> answer = new ArrayList<Integer>();
        int days = 0;
        
        for(int i = 0;i<progresses.length;i++){
            int num = 100 - progresses[i];
            if(num % speeds[i] == 0){
                q.offer(num / speeds[i]);
            }else{
                q.offer(num / speeds[i]+1);
            }
        }
        int cnt = 1;
        int prevNum = q.poll();
        while(!q.isEmpty()){
            int curNum = q.poll();
            if(prevNum >= curNum){
                cnt++;
            }else{
                answer.add(cnt);
                //System.out.print(cnt + " ");
                cnt = 1;
                prevNum = curNum;
            }
        }
        answer.add(cnt);
        //System.out.print(cnt + " ");
        int [] answer2 = new int[answer.size()];
        for(int i = 0;i<answer.size();i++){
            answer2[i] = answer.get(i);
        }
        
        return answer2;
    }
}