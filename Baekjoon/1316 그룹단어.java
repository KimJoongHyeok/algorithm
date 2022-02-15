import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int answer = 0;

    for(int i = 0;i<num;i++){
      String s = sc.next();
      Boolean[]arr = new Boolean[26];
      boolean tmp = true;
      for(int j = 0;j<s.length();j++){
        int index = s.charAt(j)-'a';
        // 사용해보지 않은 문자라면,false라면
        if(!arr[index]){
          arr[index] = true;
        }
        //사용해본 문자라면,true라면
        else{
          if(s.charAt(j) != s.charAt(j-1)){
            tmp = false;
            break;
          }
        }//else
      }//for
      if(tmp) answer++;
    }
    System.out.println(answer);
  }
}

// public class Main {
	
// 	public static void main(String[] args){
// 		Scanner sc = new Scanner(System.in);

// 		int N = sc.nextInt();
// 		int cnt = 0; // 그룹 단어 개수
		
// 		for (int i = 0; i < N; i++) {
// 			String S = sc.next();
// 			boolean check[] = new boolean[26]; // 알파벳 사용 내역
// 			boolean tmp = true; // 그룹 단어 인지
			
// 			for (int j = 0; j < S.length(); j++) {
// 				int index = S.charAt(j)-'a';
// 				if(check[index]) { // 이전에 사용한적이 있는 문자라면
// 					if(S.charAt(j) != S.charAt(j-1)) { // 이전 문자와 연속되지 않는다면
// 						tmp = false; // 그룹 단어가 아님
// 						break;
// 					}
// 				}else { // 이전에 사용한적이 없는 문자라면
// 					check[index] = true; // 문자 사용 체크
// 				}
// 			}
// 			if(tmp) cnt++;
// 		}
		
// 		System.out.println(cnt);
// 	}
// }