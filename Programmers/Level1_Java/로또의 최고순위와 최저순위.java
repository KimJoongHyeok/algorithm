public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
        
        Arrays.sort(lottos);
        Arrays.sort(win_nums);
        
        int zeroNum = 0;
        int sameNum = 0;
        
        for(int i = 0;i<6;i++){
            if(lottos[i] == 0){
                zeroNum++;
            }
            else{
                for(int j = 0;j<6;j++){
                    if(lottos[i] == win_nums[j]){
                        sameNum++;
                        break;
                    }
                }
            }
        }
       
        //System.out.println(zeroNum + " " + sameNum);
        int[]count = {6,6,5,4,3,2,1};
        answer[0]=count[zeroNum+sameNum];
        answer[1]=count[sameNum];
        System.out.println("sameNum : " + sameNum);
        System.out.println("zeroNum : " + zeroNum);
//         for(int i = 0;i<7;i++){
//             if((sameNum + zeroNum) == count[i]){
//                 answer[0] = i+1;
//             }
//             if(sameNum == count[i]){
//                 if(i == 6 || i == 7){
//                     answer[1] = i;
//                     break;
//                 }
//                 answer[1] = i+1;
//             }
            
//         }
        
        
        return answer;
    }