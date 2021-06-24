import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        
        int min = arr[0];

        ArrayList<Integer>list = new ArrayList<Integer>();
       
        for(int i = 0;i<arr.length;i++){
            if(arr[i] < min){
                min = arr[i];
            }
            list.add(arr[i]);
        }
        list.remove(Integer.valueOf(min));

        int []answer = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        if(list.size() == 0){
            int [] answer2 = new int[1];
            answer2[0] = -1;
            return answer2;
        }
      


       return answer;
    }
}