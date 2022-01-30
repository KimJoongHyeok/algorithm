import java.util.*;
class Solution { 
    public String solution(String[] participant, String[] completion){ 
        // Arrays.sort(participant); 
        // Arrays.sort(completion); 
        // int i; 
        // for (i=0; i<completion.length; i++) { 
        //     if (!participant[i].equals(completion[i])) { 
        //         return participant[i]; 
        //     } 
        // } 
        // return participant[i]; 
        String answer = "";
        Map<String,Integer> map = new HashMap<>();
        
        for(String name : participant){
            map.put(name,map.getOrDefault(name,0)+1);
        }
        for(String name : completion){
            map.put(name,map.get(name)-1);
        }
        
        for(String name : participant){
            if(map.get(name) != 0){
                answer = name;
                break;
            }
        }
        //System.out.print(map);
        
        return answer;
    }
}