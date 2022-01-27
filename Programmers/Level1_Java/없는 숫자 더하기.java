class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        boolean []b = new boolean[10];
        
        for(int i = 0;i<numbers.length;i++){
            int num = numbers[i];
            if(b[num] == false){
                b[num] = true;
            }
        }
        
        for(int i = 0;i<b.length;i++){
            if(b[i] == false){
                answer+= i; 
            }
        }
        return answer;
    }
}