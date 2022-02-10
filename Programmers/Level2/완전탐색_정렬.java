import java.util.Collections;
import java.util.ArrayList;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int n = brown + yellow;
        int sqrt = (int)Math.sqrt(n);
        ArrayList<Integer> arr = new ArrayList<>(); // 약수 받을 ArrayList
        int x,y; // x 가로 y 세로
        
        for(int i = 1; i <= sqrt; i++){
           if(n % i == 0){ // 약수 중 작은 수 저장
            arr.add(i);
                if(n / i != i){ // 약수 중 큰 수 저장
                    arr.add(n / i);
                }
            }
        }
        
        Collections.sort(arr); //약수 오름차순 정렬
        
        int arr_length = 0;
        if(arr.size() % 2 == 0){
            arr_length = arr.size() / 2;
        }else{
            arr_length = (arr.size() / 2) + 1;
        }
        System.out.println("arr_length : " + arr_length);
        for(int i = 0;i<arr_length;i++){
            y = arr.get(i); // 세로
            //System.out.println("y : " + y);
            x = n / y; //가로
            //System.out.println("x : " + x);
            if( y > 2 ){
                if(brown == ((x*2) + ((y-2)*2))){
                    answer[0] = x;
                    answer[1] = y;
                    break;
                    //System.out.println("enter y : " + y);
                }
            }
        }
 
        System.out.print(arr);
        return answer;
    }
}