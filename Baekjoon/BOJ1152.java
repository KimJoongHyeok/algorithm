import java.util.*;

class BOJ1152{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String line = sc.nextLine();

    int count = 0;
    
    for(int i = 0;i<line.length();i++){
      if(line.charAt(i) == ' '){
        count++;
      }
    }
    if(line.charAt(0) != ' ' && line.charAt(line.length()-1) != ' '){
      count = count +1;
    }
    if(line.charAt(0) == ' ' && line.charAt(line.length()-1) == ' '){
      count = count -1;
    }
    System.out.print(count);
  }
}