import java.util.*;

class Solution {
    public String solution(int[] numbers) {
        String answer = "";
        ArrayList<String>list = new ArrayList<String>();
        
        String[] arr = new String[numbers.length];
        
        for(int i = 0;i<numbers.length;i++){
            arr[i] = String.valueOf(numbers[i]);
        }
        
        Arrays.sort(arr,new Comparator<String>(){
            @Override
            public int compare(String s1,String s2){
                StringBuilder sb = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                // String a = sb.append(s1).append(s2).toString();
                // sb.setLength(0);
                // String b = sb.append(s2).append(s1).toString();
                sb.append(s1).append(s2);
                sb2.append(s2).append(s1);
                return (sb2).compareTo(sb);
            }
        });
        
        if(arr[0].equals("0")) return "0";
        
        for(String s : arr){
            answer += s;
        }
                
        return answer;
    }
}