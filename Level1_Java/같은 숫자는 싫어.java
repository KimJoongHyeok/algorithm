import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        
        int a = 10;
        ArrayList<Integer>list = new ArrayList<Integer>();
        
        for(int i = 0;i<arr.length;i++){
            while(arr[i] != a){
                list.add(arr[i]);
                a = arr[i];
            }
        }
        
        int []answer = new int[list.size()];
        for(int i = 0;i<list.size();i++){
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}