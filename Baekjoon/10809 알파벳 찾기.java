import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int [] arr = new int[26];

    //arr배열 -1로 초기화
    for(int i =0;i<arr.length;i++){
      arr[i] = -1;
    }

    for(int i = 0;i<s.length();i++){
      int num = s.charAt(i) - 'a';
      if(arr[num] == -1){
        arr[num] = i;
      }
    }

    for(int i = 0;i<arr.length;i++){
      System.out.print(arr[i] + " ");
    }
  }
}