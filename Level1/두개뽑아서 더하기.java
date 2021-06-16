import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        
        ArrayList<Integer>list = new ArrayList<Integer>();
        int result=0;
        int cnt = 0;
        for(int i=0;i<numbers.length;i++){
            for(int j = i+1;j<numbers.length;j++){
                   result = numbers[i] + numbers[j];
                    if (!list.contains(result)) {
					    list.add(result);
				    }
                }
            }
        
        int[] answer = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        Arrays.sort(answer);
        return answer;
    }
}