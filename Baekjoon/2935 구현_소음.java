import java.util.*;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    String A = sc.nextLine();
    char b = sc.nextLine().charAt(0);
    String B = sc.nextLine();

    StringBuilder answer = new StringBuilder();

    if(b == '*'){
      answer.append(A);
      for(int i = 0;i<B.length()-1;i++){
        answer.append('0');
      }
    }else if(b == '+'){
      if(A.length() == B.length()){
        answer.append("2");
        for(int i = 0;i<B.length()-1;i++){
          answer.append("0");
        }
      }else{
        if(A.length() < B.length()){
          String temp = A;
          A = B;
          B = temp;
        }
        answer.append("1");
        for(int i = 0;i<A.length() - B.length()-1;i++){
          answer.append("0");
        }
        answer.append(B);
      }
    }
  System.out.print(answer);

  }
}