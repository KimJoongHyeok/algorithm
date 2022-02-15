import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s1 = sc.next();
    String s = s1.toUpperCase();
    //System.out.println(s);

    int []arr = new int[26];

    for(int i = 0;i<s.length();i++){
      int num = s.charAt(i) - 'A';
      arr[num]++;
    }

    int max = 0;
    char ch = '?';
    for(int i = 0;i<arr.length;i++){
      if(arr[i] > max){
        max = arr[i];
        ch = (char)(i + 'A');
      }
      else if(max == arr[i]){
        ch = '?';
      }
    }
    System.out.println(ch);
  }
}