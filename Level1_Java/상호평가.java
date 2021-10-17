class Solution {
    public String solution(int[][] scores) {
        String answer = "";
        int n = scores[0].length;
        
        for(int i = 0;i<n;i++){
            int sum = 0; //총점를 위한 변수
            int cnt = n; // 나눌 갯수를 구하기 위한 변수
            int max_num = scores[0][i];
            int min_num = scores[0][i];
            for(int j = 0;j<n;j++){
                sum += scores[j][i];
                if(scores[j][i] > max_num)
                    max_num = scores[j][i];
                if(scores[j][i] < min_num)
                    min_num = scores[j][i];
            }
            int same_max_num = 0; //최고점과 같은 점수를 체크하기 위한 변수
            int same_min_num = 0;
            for(int j = 0;j<n;j++){
                if(i != j && scores[j][i] == max_num) // 대각선에 있는 수(자신이 평가한 점수)가 아닌 점수중 최고점이면 ++
                    same_max_num++;
                if(i != j && scores[j][i] == min_num) 
                    same_min_num++;
            }
            if(scores[i][i] == max_num  && same_max_num == 0){ //  대각선에 있는 수(자신이 평가한 점수)가 최고점이면서 최고점과같은점수가 0이면 총점에서 빼줌
                sum -= scores[i][i];
                cnt--;
            }
            else if(scores[i][i] == min_num  && same_min_num == 0){
                sum -= scores[i][i];
                cnt--;
            }
            int avg = sum/cnt;
            if(avg >= 90){
                answer += "A";
            }else if( 80 <= avg && avg < 90){
                answer += "B";
            }else if( 70 <= avg && avg < 80){
                answer += "C";
            }else if( 50 <= avg && avg < 70 ){
                answer += "D";
            }else{
                answer += "F";
            }
        }
        return answer;
    }
}