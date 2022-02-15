import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.nextLine();
    String num = sc.nextLine();
    int answer = 0;
    for(int i = 0;i<n;i++){
      int index = num.charAt(i) - '0';
      answer += index;
    }

    System.out.println(answer);
  }
}