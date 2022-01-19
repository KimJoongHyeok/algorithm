import java.util.*;

class Main {
  public static void main(String[] args) {
    String s = "02984";

    long result = s.charAt(0) - '0';
    for(int i = 0;i<s.length();i++){
      int num = s.charAt(i)-'0';
      if(num <= 0 || result <= 1){
        result += num;
      }
      else{
        result *= num;
      }
    }
    System.out.println(result);
  }
}