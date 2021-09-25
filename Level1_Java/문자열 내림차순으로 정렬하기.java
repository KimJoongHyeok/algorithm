import java.util.*;
 
class Solution {
  public String solution(String s) {
      String answer = "";
      
      String str[] = s.split("");
      Arrays.sort(str);
      Collections.reverse(Arrays.asList(str));
                 
      return String.join("",str);
  }
}
